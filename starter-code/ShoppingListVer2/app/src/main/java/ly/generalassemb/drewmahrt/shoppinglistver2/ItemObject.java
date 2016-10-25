package ly.generalassemb.drewmahrt.shoppinglistver2;

/**
 * Created by Serkan on 25/10/16.
 */

public class ItemObject {
    private String mItemName, mDescription, mType;
    private double mPrice;

    public ItemObject(String itemName, String description, double price, String type) {
        mItemName = itemName;
        mDescription = description;
        mPrice = price;
        mType = type;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getItemName() {
        return mItemName;
    }

    public void setItemName(String itemName) {
        mItemName = itemName;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }
}
