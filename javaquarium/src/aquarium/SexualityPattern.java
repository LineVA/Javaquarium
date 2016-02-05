/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

import java.util.ArrayList;

/**
 *
 * @author doyenm
 */
public interface SexualityPattern {
    public void breed(Fish fish, ArrayList<Inhabitant> fishesList, ArrayList<Inhabitant> dying);
}

class MonoGendered implements SexualityPattern{

    @Override
    public void breed(Fish fish, ArrayList<Inhabitant> fishesList, ArrayList<Inhabitant> dying) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Hermaphrodite implements SexualityPattern{

    @Override
    public void breed(Fish fish, ArrayList<Inhabitant> fishesList, ArrayList<Inhabitant> dying) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class HermaphroditeByAge implements SexualityPattern{

    @Override
    public void breed(Fish fish, ArrayList<Inhabitant> fishesList, ArrayList<Inhabitant> dying) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}