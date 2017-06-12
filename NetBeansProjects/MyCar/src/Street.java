

/*
This is the class for the street, it will have an array for all the components 
*/
public class Street {
    private static Street Instance;
	
	
    private Street()
    {

    }

    public synchronized static Street getInstance()
    {
            if (Instance==null)
            {
                    Instance = new Street();
            }
            return Instance;
    }

    
}
