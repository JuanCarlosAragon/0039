import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        //if(index >= 0 && index < files.size()) {
        if(validIndex(index)){
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        //if(index >= 0 && index < files.size()) {
        if(validIndex(index)){
            files.remove(index);
        }
    }
    
    /**
     * Comprueba que un determinado Indice est� dentro del ArrayList
     */
    public void checkIndex(int index){
        if(files.size() < index){
            System.out.println("El indice debe estar entre 0 y " + files.size());
        }
    }
    /**
     * Devuelve true si el indice introducido como parametro se encuentra en el 
     * Atributo Files.
     */
    public boolean validIndex(int index){
        boolean isValid = false;
        if((files.size() - 1) >= index){
            isValid = true;
        }
        
        return isValid;
    }
    /**
     * Devuelve el indice del primer archivo que contiene un texto concreto
     */
     public int findFirst(String text){
        int index = 0;
        int count = -1;
        boolean found = false;
        int size = files.size();
        while (!found && index < size){
            if (files.get(index).contains(text)){
                found = true;
                count = index;
            }
            else{
                index = index + 1;
                count = -1;
            }
        }
        return count;
    }
    
}
