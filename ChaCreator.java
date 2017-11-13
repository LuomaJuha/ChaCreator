/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chacreator;

enum State{
    create,
    remove,
    load,
    save,
    exit,
    idle
}

/**
 *
 * @author Suolapurkki
 */
public class ChaCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        State current = State.idle;
        
        while(current != State.exit){
            System.out.println("");
        }
    }
    
}
