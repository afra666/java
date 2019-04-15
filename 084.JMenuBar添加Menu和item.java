//main
this.MyMenuBar();//create
		this.add(this.bar);//use


//方法
public void MyMenuBar() {
		
		
		//bar
		bar=new JMenuBar();
		//menu1 circle
//		JMenu menu1=new JMenu("Level");
//		menu1.setVisible(true);
//		menu1.setBounds(10, 0, 50, 20);
//		
//		JMenuItem itm11=new JMenuItem("Previous Level");
//		itm11.addActionListener(this);
//		JMenuItem itm12=new JMenuItem("Next Level");
//		itm12.addActionListener(this);
//		JMenuItem itm13=new JMenuItem("Choose Level");
//		itm13.addActionListener(this);
//		
//		menu1.add(itm11);
//		menu1.add(itm12);
//		menu1.add(itm13);
//		
//		bar.add(menu1);
		String listA[]={"Theme","Level","Music","About"};
		String listB[][]= {
				{"Grassland","Pink Leaves","Autumn","Sunset","Riverside"},
				{"","Replay","Previous Level","Next Level","Choose Level"},
				{"Cheerful","Metal","Chinese Zither","Memories","Saxophone"},
				{"","","","","Super Pecs V1.0"},
		};
		JMenu menu[]=new JMenu[4];
		JMenuItem item[][]=new JMenuItem[4][5];
		int j=0;
		for(int i=0;i<4;i++){
			menu[i]=new JMenu(listA[i]);
			menu[i].setVisible(true);
			menu[i].setBounds(6+i*50, 0, 50, 20);
			if (i==0) {
				j=0;
			}
			if (i==1) {
				j=1;
			}
			if (i==2) {
				j=0;
			}
			if (i==3) {
				j=4;
			}
			for (;j < 5; j++) {
			item[i][j]=new JMenuItem(listB[i][j]);
			item[i][j].addActionListener(this);
			menu[i].add(item[i][j]);
				if (i==1&&j==3) {menu[i].addSeparator();}
			}
			bar.add(menu[i]);
		}

		//end
		
		
		bar.setBounds(0, 0, 800, 20);
		bar.setLayout(null);
		bar.setVisible(true);
		
	}
