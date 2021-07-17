FileName.substring(0,index);
    String extension = inFileName.substring(index+1);
    FileInputStream fin = new FileInputStream(inFileName);
    int size = fin.available();
    int splitSize = size /N;
    i