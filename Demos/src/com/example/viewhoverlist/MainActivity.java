package com.example.viewhoverlist;

import java.util.*;
import java.util.zip.Inflater;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidviewhover.BlurLayout;
import com.example.viewhoverlist.R;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView viewList = getListView();
		MyAdapter adapter = new MyAdapter(this);
		viewList.setAdapter(adapter);
	}

	public final class ViewHolder{
		public BlurLayout blur_layout;
		public TextView ltitle;
	}
	
	class MyAdapter extends BaseAdapter{
		
		String[] titles = new String[] {
				"DropOut+FadeOutRight","Landing+FadeOutLeft"
				,"SlideInLeft+TakingOff","Flash+FadeOutRight"
				,"Pulse+SlideOutDown","RubberBand+FadeOutRight"
				,"Shake+ZoomOutUp","Swing+ZoomOutRight"
				,"Wobble+ZoomOutDown","Bounce+SlideOutDown"
				,"Tada+SlideOutLeft","StandUp+RotateOutDownRight"
				,"Wave+RotateOutUpLeft","Hinge+FadeOutRight"
				,"RollIn+RollOut","BounceIn+FadeOutRight"
				,"FadeInLeft+FadeOutRight","FlipInX+FlipOutX"
				,"DropOut+FlipOutY","RotateInUpLeft+FadeOutRight"
				,"SlideInRight+SlideOutRight","ZoomIn+ZoomOut"
		};
		LayoutInflater inflater;
		Context context=null;
		public MyAdapter(Context context) {
			// TODO Auto-generated constructor stub
			this.context=context;
			inflater=LayoutInflater.from(context);
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return titles.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return titles[arg0];
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}
		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			Log.e("getView","xxxxx");
			ViewHolder holder=null;
			if (arg1==null){
				holder=new ViewHolder();
				arg1=inflater.inflate(R.layout.list_item, null);
				holder.ltitle=(TextView) arg1.findViewById(R.id.ltitle);
				arg1.setTag(holder);
				holder.blur_layout=(BlurLayout) arg1.findViewById(R.id.blur_layout);
			}else{
				holder=(ViewHolder) arg1.getTag();
			}
			
			//title
			holder.ltitle.setText(arg0+". "+titles[arg0]);
			//hover
			View hover = LayoutInflater.from(context).inflate(R.layout.list_img, null);
			holder.blur_layout.setHoverView(hover);
			holder.blur_layout.setBlurDuration(700);
			
			setAnimation(holder.blur_layout,arg0,hover);
			
			return arg1;
		}
		private void setAnimation(BlurLayout blur_layout, int arg0, View hover) {
			// TODO Auto-generated method stub
			if (arg0==0){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.DropOut);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FadeOutRight);
			}
			else if (arg0==1){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Landing);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FadeOutLeft);
			}
			else if (arg0==2){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.SlideInLeft);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.TakingOff);
			}
			else if (arg0==3){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Flash);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FadeOutRight);
			}
			else if (arg0==4){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Pulse);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.SlideOutDown);
			}
			else if (arg0==5){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.RubberBand);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FadeOutRight);
			}
			else if (arg0==6){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Shake);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.ZoomOutUp);
			}
			else if (arg0==7){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Swing);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.ZoomOutRight);
			}
			else if (arg0==8){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Wobble);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.ZoomOutDown);
			}
			else if (arg0==9){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Bounce);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.SlideOutDown);
			}
			else if (arg0==10){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Tada);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.SlideOutLeft);
			}
			else if (arg0==11){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.StandUp);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.RotateOutDownRight);
			}
			else if (arg0==12){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Wave);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.RotateOutUpLeft);
			}
			else if (arg0==13){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.Hinge);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FadeOutRight);
			}
			else if (arg0==14){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.RollIn);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.RollOut);
			}
			else if (arg0==15){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.BounceIn);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FadeOutRight);
			}
			else if (arg0==16){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.FadeInLeft);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FadeOutRight);
			}
			else if (arg0==17){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.FlipInX);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FlipOutX);
			}
			else if (arg0==18){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.DropOut);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FlipOutY);
			}
			else if (arg0==19){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.RotateInUpLeft);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.FadeOutRight);
			}
			else if (arg0==20){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.SlideInRight);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.SlideOutRight);
			}
			else if (arg0==21){
				blur_layout.addChildAppearAnimator(
						hover, R.id.limg, Techniques.ZoomIn);
				blur_layout.addChildDisappearAnimator(
						hover, R.id.limg, Techniques.ZoomOut);
			}
		}
		
	}
}
