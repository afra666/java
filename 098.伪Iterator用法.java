public void removeGroundLine(int groundLines) {
		//应该用iterator
		Iterator iter=uList.iterator();
		while (iter.hasNext()) {
			Unit tmpU=(Unit)iter.next();
			if (tmpU.getY0()/CELL==groundLines) {
				iter.remove();
			}
		}
		
	}
