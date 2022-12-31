package tp;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metierProduit =new MetierProduitImpl();
   /*     metierProduit.list.add(new Produit(165161,"choco","candy",140.0,"type chocolat",100));
        metierProduit.list.add(new Produit(165161,"bono","candy",100.0,"type biscuit",100));
        metierProduit.list.add(new Produit(165161,"choco","candy",150.0,"type chocolat",100));*/
        System.out.println("1. Afficher la liste des produits.\n" +
                "2. Rechercher un produit par son id.\n" +
                "3. Ajouter un nouveau produit dans la liste.\n" +
                "4. Supprimer un produit par id.\n" +
                "5. Quitter ce programme.");
        int menu=0;
        Scanner input = new Scanner(System.in);
        do{
            long id;
         /*   String nom;
            String marque;
            double prix;
            String description;
            int qte;*/
            menu = input.nextInt();
            switch (menu){
                case 1 :
                    metierProduit.getAll();
                    break;
                case 2 :
                    id=input.nextLong();
                    metierProduit.findById(id);
                    break;
                case 3:
                    System.out.println("merci de saisir les donne de produit");
                    Produit p = new Produit();
                  metierProduit.add(p);
                    break;
                case 4:
                    id=input.nextLong();
                    metierProduit.delete(id);
                    break;
                case 5 :
                    System.out.println("application quitté");
                    break;
            }
        }while (menu!=5);
    }

}
