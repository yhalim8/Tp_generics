package tp;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        MetierProduitImpl metierProduit =new MetierProduitImpl();
        System.out.println("1. Afficher la liste des produits.\n" +
                "2. Rechercher un produit par son id.\n" +
                "3. Ajouter un nouveau produit dans la liste.\n" +
                "4. Supprimer un produit par id.\n" +
                "5. Sauvegarder tous les produits.\n" +
                "6. Quitter ce programme.");
        int menu=0;
        Scanner input = new Scanner(System.in);
        do{
            menu = input.nextInt();
            switch (menu){
                case 1 :
                    for (Produit pr: metierProduit.getAll()) {
                        System.out.println(pr);
                    }
                    break;
                case 2 :
                    metierProduit.findById(input.nextLong());
                    break;
                case 3:
                    System.out.println("merci de saisir les donne de produit");
                    Produit p = new Produit();
                  metierProduit.add(p);
                    break;
                case 4:
                    metierProduit.delete(input.nextLong());
                    break;
                case 5:
                    metierProduit.saveAll();
                    break;
                case 6 :
                    System.out.println("application quitté");
                    break;
            }
        }while (menu!=6);


    }
}
