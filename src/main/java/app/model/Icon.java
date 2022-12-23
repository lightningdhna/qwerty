package app.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class Icon {
    public static ImageView getIcon(String name){
        Image image = new Image (Objects.requireNonNull(Icon.class.getResourceAsStream("/icon/" + name)));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(30);
        imageView.setFitWidth(30);
        return new ImageView(image);
    }
}
