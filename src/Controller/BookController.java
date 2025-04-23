package Controller;
import Models.Book;

public class BookController {

    public void ordenamientosInsercion(Book[] books){
        for(int i=1;i<books.length;i++){
            Book actual = books[i];
            int j=i-1;
            /*while(j >=0 && books[j].nombre()>actual.nombre()){
                books[j+1]=books[j];
                j--;}*/

            while(j >=0 && books[j].getNombre().compareTo(getNombre())>0){
                books[j+1]=books[j];
                j--;
            }
            books[j+1]=actual;
        }
    }

    public Book busquedaBinaria(Book[] books, int anio){
        int bajo=0;
        int alto=books.length;
        while (bajo<= alto){
            int medio= (bajo+alto)/2;
            if(books[medio].getNombre()==nombre){
                return books[medio];
            }else if (books[medio].getNombre()>books.getNombre){
                bajo = medio+1;
            }else{
                alto= medio-1;
            }
        }
        return null;

    }
    
}
