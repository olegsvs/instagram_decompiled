package X;

import android.graphics.PointF;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.model.Tag;

/* renamed from: X.2F4 */
public final class AnonymousClass2F4 {
    /* renamed from: B */
    public static ProductTag m14801B(JsonParser jsonParser) {
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        Tag productTag = new ProductTag();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (currentName.equals("product_id")) {
                productTag.C().XOA(jsonParser.getText());
            } else if (currentName.equals("product_name")) {
                productTag.f17742B.f4988J = jsonParser.getText();
            } else if (currentName.equals("product_price")) {
                currentName = jsonParser.getText();
                Product product = productTag.f17742B;
                product.f4981C = currentName;
                product.f4984F = currentName;
            } else if (currentName.equals("position")) {
                jsonParser.nextToken();
                float floatValue = jsonParser.getFloatValue();
                jsonParser.nextToken();
                productTag.f15363B = new PointF(floatValue, jsonParser.getFloatValue());
                jsonParser.nextToken();
            } else if (currentName != null) {
                jsonParser.skipChildren();
            }
        }
        return productTag;
    }
}
