package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3;

import java.util.ArrayList;

public class ManagerAtom {
    ArrayList<Atom> atoms;

    public ManagerAtom(ArrayList<Atom> atoms) {
        this.atoms = atoms;
    }

    public void addAtom(Atom atom){
        atoms.add(atom);
    }

    public void removeAtom(Atom atom){
        atoms.remove(atom);
    }

    public void printallAtom(){
        for (var x: atoms){
            System.out.println(x);
        }
    }
}
