    FileOutputStream fout = new FileOutputStream(outFile2);
    for(int i = 0;i<=Splitsize-1;i++)
    {
      int readByte = fin.read();
      fout.write(readByte);
    }
    fout.close();
    fin.close();
  }
}