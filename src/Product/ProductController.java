package Product;

import java.util.ArrayList;

import Exceptions.NegativePriceException;
import Exceptions.NotFoundException;

public class ProductController {

    private ArrayList<ProductModel> Products = new ArrayList<>();

    public String create(ProductModel payload) {
        if (payload.getPriceInCents() < 0) {
            throw new NegativePriceException("O preço do produto precisa ser um número positivo.");
        }
        Products.add(payload);
        return "Produto " + payload.getName() + " adicionado."; // Corrigindo a mensagem de retorno
    }

    // Método para listar todos os produtos
    public ArrayList<ProductModel> read() {
        return Products;
    }

    // Método para buscar o preço de um produto pelo código de barras
    public int retrievePrice(String barCode) {
        for (ProductModel Product : Products) {
            if (Product.getBarCode().equals(barCode)) {
                return Product.getPriceInCents();
            }
        }
        throw new NotFoundException("Produto com código de barras " + barCode + " não encontrado.");
    }
}
