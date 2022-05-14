package worldlessVirologist;

import java.util.List;
import java.util.Scanner;

public class Storage extends Field{
   // private List<Material> materials
    private Material material;
    public Storage(Material m) {
    	material=m;
    }

    /**
     * move on a storage type of field
     * the palyer can decide if they want to pick up the material there
     */
    @Override
    public void Accept(Virologist v){
    	if(v.getBear()) {
    		this.OnField=v;
        	v.setField(this);
        	material=null;
        	return;
    	}
    	this.OnField=v;
    	v.setField(this);
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Moved to a Storage.");
        System.out.println("Do you want to pick up the material? 1: yes/ 2: no");
        x= sc.nextInt();
        if(x==1){
            v.PickUpMaterial(material);
        }
    }
}
