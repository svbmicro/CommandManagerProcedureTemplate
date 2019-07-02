

public class ResultSet {



    public boolean doesFieldExist(DisplayPropertyEnum iProperty){

        return true;

    }

    public int getfieldPropertyID(int iIndex){

        return 0;

    }

    public ResultCell  getResultCell(DisplayPropertyEnum  iProperty){

        ResultCell rc = new ResultCell();

        return rc;

    };


    public ResultCell  getResultCell(int  iIndex){

        ResultCell rc = new ResultCell();

        return rc;

    }


    public void moveFirst(){


    }

    public void moveNext(){


    }

    public void moveTo(int iRowID){


    }

    public boolean isEof() {


        return false;
    }


    public int getRowCount(){

        return 0;
    }

    public int getColumnCount() {

        return 0;
    }





}
