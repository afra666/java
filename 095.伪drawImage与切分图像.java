public class PanelGame extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelGame() {
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Image img=new ImageIcon("graphics/window/window.png").getImage();
//		g.drawImage(img, 0, 0, null);//需要注释掉
		g.drawImage(img, 0, 0, 20, 20, 0, 0, 20, 20, null);//切分图形
	}
}
