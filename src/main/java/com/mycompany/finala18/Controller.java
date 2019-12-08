/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finala18;


import java.io.Console;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

/**
 *
 * @author 1995089
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

       
                IOsJsonFiles.loadJsonFile(args[0]);
              JSONObject mainObject = IOsJsonFiles.loadJsonFile(args[0]);
              JSONObject result = mainObject.getJSONObject("result");
                    IOsJsonFiles.createJsonFile(args[1],
                            IOsJsonFiles.loadJsonFile(args[0]));
                    

    }

}
