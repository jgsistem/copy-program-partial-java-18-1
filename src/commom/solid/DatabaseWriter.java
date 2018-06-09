/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commom.solid;

import commom.solid.IWriter;
import common.Util;

/**
 *
 * @author FISI-Labo07
 */
public class DatabaseWriter implements IWriter{

    @Override
    public void write(String value) {
        Util.output(" *Database: " + value);
    }
    
}
