package com.example.msilveo.thesis_draft3;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    //Arrays
    public int[] slide_images = {
            R.drawable.india,
            R.drawable.old_paper,
            R.drawable.shell
    };

    public String[] slide_headings = {

            "BRAHMIC FAMILY",
            "ANCIENT SCRIPT",
            "GIANT CLAM"
    };

    public String[] slide_descs = {
            "Paul Morrow of the The Filipino Express (2017) explored some of the claims that Baybayin, our ancient script known to be developed from the Brahmic script of India, possessed a meaning beyond its actual function. It is a pre-Spanish Philippine writing system. It is a member of the Brahmic family and is recorded as being in use in the 16th century.",

            "It continued to be used during the Spanish colonization of the Philippines up until the late 19th century. Leaning toward mysticism and divinity, Baybayin characters were said to act like pictographs that signifies various meanings from its shapes. It was widely used in the country prior to Spanish conquest up until 1668 when the script forms were removed from official Doctrina Christiana publications.",

            "From the research conducted by Bonifaco Comandante Jr (2011), the Baybayin script originated from the taklobo or giant clam. He made this discovery after spending some time with a Tagbanua native from Palawan. The giant clam, said Comandante, was used by our ancestors as food, tool, container, utensil, source of lime for their betel chew, body ornament, or as a burial implement."
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){

        container.removeView((RelativeLayout)object);
    }
}
