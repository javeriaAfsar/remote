/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteProxy;

/**
 *
 * @author JAVERIA
 */
public interface SocketInterface {
     String readLine();
    void  writeLine(String str);
    void  dispose();
    
}
