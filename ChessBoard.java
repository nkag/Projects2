package neha_practice;

public class ChessBoard {
	
	char[][] board_array = new char[8][8];
    board_array[][]= {
    		
    		{'R','N','B','K','Q','B','N','R'},
    		{'P','P','P','P','P','P','P','P'},
    		{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    		{' ',' ',  ' ', ' ', ' ', ' ', ' ', ' '},
    		{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    		{' ', ' ', ' ',' ',' ',' ', ' ', ' '},
    		{'p','p','p','p','p','p','p','p'},
    		{'r','n','b','k','q','b','n','r'},
    		
    }; 
    
    int NumberOfPoints(String Player){
    	int points=0;
    	for(int x=0; x<8; x++)
    	{
    		for(int y=0; y<8; y++){
    			
    			if(Player=="black")
    			{
    				switch(board_array[x][y])
    				{
    				case board_array[x][y] ='P': points=points++; break;
    				case board_array[x][y] = 'B': points=points+3; break; 
    				
    				
    				}
    			if(Player=="white")
    			{
    			   switch(board_array[x][y])
    			   {
    			   case board_array[x][y] ='p': points=points++; break;
    			   }
    				
    			}
    				
    			}
    			
    			
    			
    			
    		}
    	}
 
    	
    }
    
    class PositionQueen{
    	
    	int row, column;
    	
    	public int[][] AllPositions(String Player)
    	{
    		for(int x=0; x<8; x++)
    		{
    			for(int y=0; y<8; y++)
    			{
    				if(Player.equals("Black"))
    					{
    					if(board_array[x][y]=' ')
    				return board_array[x][y];
    				if(board_array[x][y])
    				
    			}
    		}
    		}
    		
    		
    	}
    	
    }
    
    
    
    
    
}





