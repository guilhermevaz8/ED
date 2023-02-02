public class BooleanArrayIntSet implements IntSet {
    private int size;
    private boolean bool[];
   
    BooleanArrayIntSet(int maxSize){
        bool= new boolean[maxSize+1];
        size=0;
        }

    public boolean add(int x){
        if (!this.contains(x)){
            bool[x]=true;
            size++;  
            return true;       
         }
        return false;
    }


    public boolean remove(int x){
        if (this.contains(x)){
                bool[x]=false;
                size--;  
                return true;       
             }
        return false;
        }

    public boolean contains(int x){
        if (this.bool[x]==true) return true;
        return false;
    }

    public int size(){
        return size;
    }

    public void clear(){
        for (int i=0;i<bool.length;i++) 
            if (this.bool[i]==true){
                this.bool[i]=false; 
        }
        size=0;      
    }

    public boolean equals(IntSet s){
        if(s.size()!=this.size()) return false;
        else{
         for (int i=0; i<1000001; i++){
            if ((s.contains(i) && !this.contains(i)))
               return false;
            if ((this.contains(i) && !s.contains(i)))
                return false;}}
        return true;
      }

    public IntSet intersection(IntSet s){
        IntSet tmp= new BooleanArrayIntSet(1000000);
        for (int i=0;i<1000001;i++){
            if (s.contains(i) && this.contains(i)) tmp.add(i);}
        return tmp;
    }
    }
    
