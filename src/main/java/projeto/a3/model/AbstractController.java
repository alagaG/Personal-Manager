/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.a3.model;

/**
 *
 * @author 82323467
 */
public abstract class AbstractController<T> {
    
    public abstract void create(T ata);
    
    public abstract T read(T data);
    
    public abstract void update(T lastData, T newData);
    
    public abstract void delete(T data);
    
}
