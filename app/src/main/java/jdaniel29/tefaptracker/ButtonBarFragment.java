package jdaniel29.tefaptracker;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import jdaniel29.tefaptracker.data.Commodity;


public class ButtonBarFragment extends Fragment {
    Button add1CommodityButton, add23CommodityButton, add45CommodityButton, add6PlusCommodityButton;

    Commodity[] currentCommodities;
    int multiplier;

    public ButtonBarFragment() {
        multiplier=1;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_button_bar, container, false);

        add1CommodityButton     = (Button)inflatedView.findViewById(R.id.add1Commodity);
        add23CommodityButton    = (Button)inflatedView.findViewById(R.id.add23Commodity);
        add45CommodityButton    = (Button)inflatedView.findViewById(R.id.add45Commodity);
        add6PlusCommodityButton = (Button)inflatedView.findViewById(R.id.add6PlusCommodity);

        add1CommodityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Commodity commodity : currentCommodities){
                    commodity.setDistributionSizeOne(commodity.getDistributionSizeOne() + commodity.getDistributionPerBox()*multiplier);
                    commodity.updateDistributionTotal();
                }
            }
        });

        add23CommodityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Commodity commodity : currentCommodities){
                    commodity.setDistributionSizeTwoToThree(commodity.getDistributionSizeTwoToThree() + commodity.getDistributionPerBox()*multiplier);
                    commodity.updateDistributionTotal();
                }
            }
        });

        add1CommodityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Commodity commodity : currentCommodities){
                    commodity.setDistributionSizeFourToFive(commodity.getDistributionSizeFourToFive() + commodity.getDistributionPerBox()*multiplier);
                    commodity.updateDistributionTotal();
                }
            }
        });

        add1CommodityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Commodity commodity : currentCommodities){
                    commodity.setDistributionSizeOne(commodity.getDistributionSizeOne() + commodity.getDistributionPerBox()*multiplier);
                    commodity.updateDistributionTotal();
                }
            }
        });

        return inflatedView;
    }

    public void changeMultiplier(int newMultiplier){
        multiplier = newMultiplier;
    }

    public void changeCommodity(Commodity[] commodities){
        currentCommodities = commodities;
    }
}
