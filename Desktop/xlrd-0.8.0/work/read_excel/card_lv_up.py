def id(x,y,z):
		import xlrd #讀取excel模組
		book = xlrd.open_workbook ("card_lv_up.xlsx") #指定 excel 文件
		sheet = book.sheets()[0] #指定 excel 的 sheet
		default_exp =(sheet.cell (x,4) .value) #卡牌預設的 exp
		default_setexp =(sheet.cell (x,5) .value) #卡牌指定的 exp
		lv = y -1 #卡牌當前等級，計算時需要減1級，是企劃設定的公式
		effect = z #卡牌的數值影響，同屬性乘以 1.25，不同屬性乘以 1
		lvupexp = (( default_setexp * lv ) + default_exp ) * effect #計算公式
		print round (lvupexp) #印出計算後的結果，並做四捨五入
		

		

		


