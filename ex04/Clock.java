public class Clock{
    private int h;
    private int m;
    private int state;
    public Clock(int hour,int min){
        h = hour;
        m = min;
        state = 0;
    }
    public void pressUp(){
        if(state == 1)
            h++;
        else if(state == 2)
            m++;
    }
    public void pressDown(){
        if(state ==1){
            h--;
        }
        else if(state == 2){
            m--;
        }
    }
    private void presstime() {
        System.out.println(h + ":" + m);
    }
    public void pressCenter(boolean longPress){
        if(longPress){
            if(state == 0)
                state = 1;
            else{
                state = 0;
                presstime();
            }
        }
        else{
            switch(state){
                case 1:
                    state = 2;break;
                case 2:
                    state = 1;break;
            }
        }
    }
}