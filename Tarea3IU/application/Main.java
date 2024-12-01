package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class Main extends Application {
	public static void main (String[]args) {
		launch();
	}
	public void start (Stage stage) {
	    // Crear el layout principal (BorderPane)
	    BorderPane main = new BorderPane();

	    GridPane gridPane = creaPane();
	    HBox barraArriba = bArriba();

	    BotonesIniciales(barraArriba);

	    EtiquetasIniciales(gridPane);
	    Imagen(gridPane);

	    main.setTop(barraArriba);
	    main.setCenter(gridPane);

	    Scene scene = new Scene(main);
	    stage.setMaximized(true);  // Pantalla completa
	    stage.setTitle("Prime-Wheels");
	    stage.setScene(scene);
	    stage.show();
	}

//------------------Botones
private void BotonesIniciales(HBox bArriba) { //Funcion para los botones
	Button botonVehiculos=new Button("Vehiculos");
	botonVehiculos.setPrefSize(300, 70);
	botonVehiculos.setMaxWidth(Double.MAX_VALUE);
	Button botonComprar=new Button("Comprar");
	botonComprar.setPrefSize(300, 70);
	botonComprar.setMaxWidth(Double.MAX_VALUE);
	Button botonConocenos=new Button("Conocenos");
	botonConocenos.setPrefSize(300, 70);
	botonConocenos.setMaxWidth(Double.MAX_VALUE);
	
	bArriba.getChildren().addAll(botonVehiculos,botonComprar, botonConocenos);
	/*gridPane.add(botonVehiculos, 0, 0);
	gridPane.add(botonComprar, 8, 0);
	gridPane.add(botonConocenos, 19, 0);
	*/
	}
//--------------------------Etiquetas Iniciales
private void EtiquetasIniciales(GridPane gridPane) {
	Label tecnologia=new Label("Tecnología para innovar");
	tecnologia.setFont(new Font("Arial",30));
	Label precio=new Label("Precio desde: $400,000.00 Mxn");
	precio.setFont(new Font("Arial",30));
	Label caracteristicas=new Label("340 Hp 3.5 Lts TURBO");
	caracteristicas.setFont(new Font("Arial",30));
	Label descubrelo=new Label("¡Descubrelo!");	
	descubrelo.setFont(new Font("Arial",30));
	
	gridPane.add(tecnologia, 0, 5);
	gridPane.add(precio, 0, 7);
	gridPane.add(caracteristicas, 0,9);
	gridPane.add(descubrelo, 0, 11);
	
}
//-------------------------Imagen
private void Imagen(GridPane gridPane) {
    Image porsche = new Image(getClass().getResourceAsStream("Porsche.jpg"));
    ImageView imagen = new ImageView(porsche);

    // Ajustamos el tamaño de la imagen
    imagen.setFitWidth(600);  // Ancho deseado
    imagen.setFitHeight(500); // Altura deseada
    imagen.setPreserveRatio(true); // 
    gridPane.add(imagen, 9, 9); 
}


//--------------------Cuadricula
private GridPane creaPane() { //Creamos la cuadricula
	GridPane gridPane=new GridPane();
	gridPane.setAlignment(Pos.TOP_LEFT);
	gridPane.setPadding(new Insets(20,20,20,20));
	gridPane.setVgap(20);
	gridPane.setHgap(20);
	return gridPane;
	}

//---------------HBox
private HBox bArriba() {
	HBox barraArriba= new HBox (25);
	barraArriba.setPadding(new Insets(10));
	barraArriba.setAlignment(Pos.CENTER);
	
	return barraArriba;
}






















}