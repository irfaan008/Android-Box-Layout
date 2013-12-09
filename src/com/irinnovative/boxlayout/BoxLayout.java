package com.irinnovative.boxlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BoxLayout extends LinearLayout {

	private View box;

	public BoxLayout(Context context) {
		super(context);
		log("constructor1");
		setUpView(context);
	}

	public BoxLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		log("constructor2");
		setUpView(context);
	}

	public BoxLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		log("constructor3");
		setUpView(context);
	}

	private void setUpView(Context context) {
		// Inflate layout here
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		// inflate whatever layout xml has your common xml
		box = inflater.inflate(R.layout.layout_box, this);
	}

	/**
	 * 
	 * 
	 * This method is used to set Title of box layout. Pass image parameter
	 * (int) as 0 to hide the thumbs
	 * 
	 * @param TitleLeftIcon
	 *            -->Left thumb to be displayed in title of box
	 * @param Title
	 *            -->Title of box layout
	 * @param TitleRightIcon
	 *            -->Right thumb to be displayed in title of box
	 */
	public void setTitle(int TitleLeftIcon, String Title, int TitleRightIcon) {
		TextView tvTitle = (TextView) box.findViewById(R.id.tvTitleCenter);
		ImageView ivTitleLeftIcon = (ImageView) box
				.findViewById(R.id.ivTitleLeftIcon);
		ImageView ivTitleRightIcon = (ImageView) box
				.findViewById(R.id.ivTitleRightIcon);

		tvTitle.setText(Title);
		if (TitleLeftIcon != 0)
			ivTitleLeftIcon.setBackgroundResource(TitleLeftIcon);
		if (TitleRightIcon != 0)
			ivTitleRightIcon.setBackgroundResource(TitleRightIcon);

	}

	/**
	 * 
	 * 
	 * Sets the text of Cell11 and Cell12 of Body. Supply null value if you want
	 * to make the cell as invisible
	 * 
	 * Applies to Row1 only
	 * 
	 * @param BodyCell11
	 * @param BodyCell12
	 */
	public void setRow1(String BodyCell11, String BodyCell12) {
		TextView tvCell11 = (TextView) box.findViewById(R.id.tvBodyCell11);
		TextView tvCell12 = (TextView) box.findViewById(R.id.tvBodyCell12);
		if (BodyCell11 != null)
			tvCell11.setText(BodyCell11);
		else
			tvCell11.setVisibility(View.GONE);
		if (BodyCell12 != null)
			tvCell12.setText(BodyCell12);
		else
			tvCell12.setVisibility(View.GONE);
		if (BodyCell11 == null && BodyCell12 == null)
			box.findViewById(R.id.drRow1).setVisibility(View.GONE);
	}

	/**
	 * 
	 * 
	 * Sets the text of Cell21 and Cell22 of Body. Supply null value if you want
	 * to make the cell as invisible
	 * 
	 * Applies to Row2 only
	 * 
	 * @param BodyCell21
	 * @param BodyCell22
	 */
	public void setRow2(String BodyCell21, String BodyCell22) {
		TextView tvCell21 = (TextView) box.findViewById(R.id.tvBodyCell21);
		TextView tvCell22 = (TextView) box.findViewById(R.id.tvBodyCell22);
		if (BodyCell21 != null)
			tvCell21.setText(BodyCell21);
		else
			tvCell21.setVisibility(View.GONE);
		if (BodyCell22 != null)
			tvCell22.setText(BodyCell22);
		else
			tvCell22.setVisibility(View.GONE);
		if (BodyCell21 == null && BodyCell22 == null)
			box.findViewById(R.id.drRow2).setVisibility(View.GONE);
	}

	/**
	 * 
	 * 
	 * Sets the text of Cell31 and Cell32 of Body. Supply null value if you want
	 * to make the cell as invisible
	 * 
	 * Applies to Row3 only
	 * 
	 * @param BodyCell31
	 * @param BodyCell32
	 */
	public void setRow3(String BodyCell31, String BodyCell32) {
		TextView tvCell31 = (TextView) box.findViewById(R.id.tvBodyCell31);
		TextView tvCell32 = (TextView) box.findViewById(R.id.tvBodyCell32);
		if (BodyCell31 != null)
			tvCell31.setText(BodyCell31);
		else
			tvCell31.setVisibility(View.GONE);
		if (BodyCell32 != null)
			tvCell32.setText(BodyCell32);
		else
			tvCell32.setVisibility(View.GONE);
		if (BodyCell31 == null && BodyCell32 == null)
			box.findViewById(R.id.drRow3).setVisibility(View.GONE);
	}

	/**
	 * 
	 * 
	 * Sets the text of Cell41 and Cell42 of Body. Supply null value if you want
	 * to make the cell as invisible
	 * 
	 * Applies to Row4 only
	 * 
	 * @param BodyCell41
	 * @param BodyCell42
	 */
	public void setRow4(String BodyCell41, String BodyCell42) {
		TextView tvCell41 = (TextView) box.findViewById(R.id.tvBodyCell41);
		Button bCell42 = (Button) box.findViewById(R.id.bBodyCell42);
		if (BodyCell41 != null)
			tvCell41.setText(BodyCell41);
		else
			tvCell41.setVisibility(View.GONE);
		if (BodyCell42 != null)
			bCell42.setText(BodyCell42);
		else
			bCell42.setVisibility(View.GONE);
	}

	/**
	 * 
	 * 
	 * This method will show/hide the devider in the box layout. Devider will
	 * appear between two rows. The default is true
	 * 
	 * @param showDevider
	 */
	public void showDevider(boolean showDevider) {
		if (!showDevider) {
			View drRow1 = box.findViewById(R.id.drRow1);
			View drRow2 = box.findViewById(R.id.drRow2);
			View drRow3 = box.findViewById(R.id.drRow3);
			drRow1.setVisibility(View.GONE);
			drRow2.setVisibility(View.GONE);
			drRow3.setVisibility(View.GONE);
		}
	}

	/**
	 * 
	 * 
	 * Gets object of Cell11 of Body
	 * 
	 * @return TextView
	 */
	public TextView getBodyCell11() {
		return (TextView) box.findViewById(R.id.tvBodyCell11);
	}

	/**
	 * 
	 * 
	 * Gets object of Cell12 of Body
	 * 
	 * @return TextView
	 */
	public TextView getBodyCell12() {
		return (TextView) box.findViewById(R.id.tvBodyCell12);
	}

	/**
	 * 
	 * 
	 * Gets object of Cell21 of Body
	 * 
	 * @return TextView
	 */
	public TextView getBodyCell21() {
		return (TextView) box.findViewById(R.id.tvBodyCell21);
	}

	/**
	 * 
	 * 
	 * Gets object of Cell22 of Body
	 * 
	 * @return TextView
	 */
	public TextView getBodyCell22() {
		return (TextView) box.findViewById(R.id.tvBodyCell22);
	}

	/**
	 * 
	 * 
	 * Gets object of Cell31 of Body
	 * 
	 * @return TextView
	 */
	public TextView getBodyCell31() {
		return (TextView) box.findViewById(R.id.tvBodyCell31);
	}

	/**
	 * 
	 * 
	 * Gets object of Cell32 of Body
	 * 
	 * @return TextView
	 */
	public TextView getBodyCell32() {
		return (TextView) box.findViewById(R.id.tvBodyCell32);
	}

	/**
	 * 
	 * 
	 * Gets object of Cell41 of Body
	 * 
	 * @return TextView
	 */
	public TextView getBodyCell41() {
		return (TextView) box.findViewById(R.id.tvBodyCell41);
	}

	/**
	 * 
	 * 
	 * Gets object of Cell42 of Body
	 * 
	 * @return Button
	 */
	public Button getBodyCell42() {
		return (Button) box.findViewById(R.id.bBodyCell42);
	}

	private void log(String string) {
		Log.d("BoxLayout", string);
	}

}