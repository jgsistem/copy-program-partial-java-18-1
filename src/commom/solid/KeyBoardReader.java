/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commom.solid;

import commom.solid.IReader;
import common.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author FISI-Labo07
 */
public class KeyBoardReader implements IReader {

    @Override
    public String read() {
        try {
            Util.outputInLine("Keyboard - Enter String:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();
        } catch (IOException ex) {
        }
        return null;
    }
    
}
