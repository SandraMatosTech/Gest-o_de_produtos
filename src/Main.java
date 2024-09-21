import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import Product.ProductController;
import Product.ProductModel;

public class Main {
    public static void main(String[] args) {
        // Define a saída padrão como UTF-8 para exibir caracteres corretamente
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        ProductController controller = new ProductController();

        // Criação de um produto com código de barras, nome, preço em centavos e estoque
        ProductModel product1 = new ProductModel("123456", "Produto A", 1500, 10);
        System.out.println(controller.create(product1));

        System.out.println("Produtos cadastrados:");
        for (ProductModel product : controller.read()) {
            System.out.println("- " + product.getName());
        }

        try {
            // Recuperação do preço do produto pelo código de barras
            int price = controller.retrievePrice("123456");
            System.out.println("Preço do Produto A: " + price + " centavos");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
