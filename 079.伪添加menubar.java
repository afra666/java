public F2() {
    	JMenu m = new JMenu("Menu");//设置菜单栏初始显示文字
    	m.add("Menu item #1 in ");//继续设置文字
    	m.add("Menu item #1 in ");//继续设置文字
    	m.add("Menu item #1 in ");//继续设置文字
    	
    	JMenuBar menuBar = new JMenuBar();//创建bar
    	menuBar.add(m);
    	
    	JFrame frame = new JFrame("MenuGlueDemo");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.add(menuBar);
    	frame.pack();
    	frame.setVisible(true);
    }
