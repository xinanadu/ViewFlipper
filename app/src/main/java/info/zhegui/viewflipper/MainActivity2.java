package info.zhegui.viewflipper;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import java.util.ArrayList;


public class MainActivity2 extends ActionBarActivity {


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ViewBannerGallery viewBannerGallery = (ViewBannerGallery) findViewById(R.id.viewBannerGallery);
        ArrayList<ViewBannerGallery.BannerItem> listData=new  ArrayList<ViewBannerGallery.BannerItem>();
        listData.add(viewBannerGallery.new BannerItem("http://file02.16sucai.com/d/file/2014/1128/2785774cb5f59d79b38ad2a45d13a610.jpg", "http://www.baidu.com", "天123"));
        listData.add(viewBannerGallery.new BannerItem("http://file02.16sucai.com/d/file/2014/1124/2a9dc0dda1dd58b3fc70db4b40b10415.jpg", "http://www.baidu.com", "地456"));
        listData.add(viewBannerGallery.new BannerItem("http://file02.16sucai.com/d/file/2014/1124/0cfe9a585e58d1a7574cc52d9f8f7a87.jpg", "http://www.baidu.com", "玄789"));
        listData.add(viewBannerGallery.new BannerItem("http://file02.16sucai.com/d/file/2014/0927/9294f0110ce51d1fc38a7c18a363630c.jpg", "http://www.baidu.com", "黄012"));
        viewBannerGallery.flip(listData, true);
    }
}
