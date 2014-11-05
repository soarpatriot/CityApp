package com.soar.cityapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;

import com.soar.cityapp.R;

public class InformationAdapter extends BaseAdapter{  
	
        private Context mContext;  
        public InformationAdapter(Context context) {  
            this.mContext=context;  
        }  
        /** 
         * 元素的个数 
         */  
        public int getCount() {  
            return texts.length;  
        }  
  
        public Object getItem(int position) {  
            return null;  
        }  
  
        public long getItemId(int position) {  
            return 0;  
        }  
        //用以生成在ListView中展示的一个个元素View  
        public View getView(int position, View convertView, ViewGroup parent) {  
            //优化ListView  
            if(convertView==null){  
                convertView=LayoutInflater.from(mContext).inflate(R.layout.item, null);  
                ItemViewCache viewCache=new ItemViewCache();  
                viewCache.mTextView=(TextView)convertView.findViewById(R.id.text);  
                viewCache.mImageView=(ImageView)convertView.findViewById(R.id.image);  
                viewCache.mImageView.setScaleType(ScaleType.CENTER_CROP);
                convertView.setTag(viewCache);  
            }  
            ItemViewCache cache=(ItemViewCache)convertView.getTag();  
            //设置文本和图片，然后返回这个View，用于ListView的Item的展示  
            cache.mTextView.setText(texts[position]);  
            cache.mImageView.setImageResource(images[position]);  
            return convertView;  
        }  
    
    //元素的缓冲类,用于优化ListView  
    private static class ItemViewCache{  
        public TextView mTextView;  
        public ImageView mImageView;  
    }  
    private  String[] texts=new String[]{"天气","我团","背景"};  
    //展示的图片  
    private int[] images=new int[]{R.drawable.no_scrip,R.drawable.no_scrip,R.drawable.no_scrip};  

}
