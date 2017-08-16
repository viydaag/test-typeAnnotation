package test.typeAnnotationMaven;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@Nullable
		Object obj = null; // might be null
		
		@NonNull
		Object nnobj; // never null
		
		obj.toString(); // checker warning: dereference might cause null pointer exception
		nnobj = obj; // checker warning: nnobj may become null
        System.out.println( "Hello World!" );
    }
}
