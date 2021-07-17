for(int j = 0;j<=splitSize-1;j++)
        {
            int readByte = fin.read();
            fout.write(readByte);
        }
        fout.close();
    }
    String outFile2 = name+"_"+ N + "." + extension;
