nt Splitsize = size - ((N-1)*splitSize);
    for(int i= 0; i <= N-2;i++)
    {
        String outFile = name+"_"+(i+1)+ "." + extension;
        FileOutputStream fout = new FileOutputStream(outFile);
        