package tp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetierProduitImpl implements IMetier<Produit>{
    List<Produit> list =new ArrayList<>();
    File file = new File("liste_produits.dat");
    @Override
    public void add(Produit o) {
        Scanner input = new Scanner(System.in);
        System.out.println("entrer l'id");
        o.setId(input.nextLong());
        input.nextLine();
        System.out.println("entrer le nom");
        o.setNom(input.nextLine());
        System.out.println("entrer la marque");
           o.setMarque(input.nextLine());
         System.out.println("entrer le prix");
        o.setPrix(input.nextDouble());
        input.nextLine();
        System.out.println("entrer la description");
        o.setDescription(input.nextLine());
             System.out.println("entrer la qte");
        o.setQte(input.nextInt());
        list.add(o);
    }

    @Override
    public List<Produit> getAll() throws Exception {
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream os = new ObjectInputStream(fi);
        List<Produit> p= (List<Produit>) os.readObject();
        os.close();
        fi.close();
        return p;
    }

    @Override
    public Produit findById(long id) {
        Produit a = null;
        for(Produit p:list) {
            if (p.id == id){
                a=p;
                System.out.println(a);
                break;
            }
            else {
                System.out.println("produit n'est pas trouvé");}
        }
        return a;

    }

    @Override
    public void delete(long id) {
        for(Produit p:list) {
            if (p.id == id){
                list.remove(p);}
            else System.out.println("produit n'existe pas");
                break;
        }
    }

    @Override
    public void saveAll() throws Exception {
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(list);
        fo.close();
        os.flush();
        os.close();
    }

    @Override
    public String toString() {
        String detail= "Liste des produits" ;

        return detail;
    }
}
