package ru.avito.StepDefs;

public enum CategorySearch {
	Любая(1,"Любая категория"),
	ТРАНСПОРТ(2,"ТРАНСПОРТ"),
	Автомобили(3,"Автомобили"),
	Мотоциклы(4,"Мотоциклы и мототехника"),
	Грузовики(5,"Грузовики и спецтехника"),
	Водный(6,"Водный транспорт"),
	Запчасти(7,"Запчасти и аксессуары"),
	НЕДВИЖИМОСТЬ(8,"НЕДВИЖИМОСТЬ"),
	Квартиры(9,"Квартиры"),
	Комнаты(10,"Комнаты"),
	Дома(11,"Дома, дачи, коттеджи"),
	ЗемельныеУчастки(12,"Земельные участки"),
	Гаражи(13,"Гаражи и машиноместа"),
	КоммерческаяНедвижимость(14,"Коммерческая недвижимость"),
	НедвижимостьЗаРубежом(15,"Недвижимость за рубежом"),
	РАБОТА(16,"РАБОТА"),
	Вакансии(17,"Вакансии"),
	Резюме(18,"Резюме"),
	УСЛУГИ(19,"УСЛУГИ"),
	ЛИЧНЫЕВЕЩИ(20,"ЛИЧНЫЕ ВЕЩИ"),
	ОдеждаОбувьАксессуары(21,"Одежда, обувь, аксессуары"),
	ДетскаяОдеждаИОбувь(22,"Детская одежда и обувь"),
	ТоварыДляДетей(23,"Товары для детей и игрушки"),
	КрасотаИЗдоровье(24,"Красота и здоровье"),
	ЧасыИУкрашения(25,"Часы и украшения"),
	ДЛЯДОМАИДАЧИ(26,"ДЛЯ ДОМА И ДАЧИ"),
	РемонтИСтроительство(27,"Ремонт и строительство"),
	МебельИИнтерьер(28,"Мебель и интерьер"),
	БытоваяТехника(29,"Бытовая техника"),
	ПродуктыПитания(30,"Продукты питания"),
	Растения(31,"Растения"),
	ПосудаИТоварыДляКухни(32,"Посуда и товары для кухни"),
	ЗАПЧАСТИИАКСЕССУАРЫ(33,"ЗАПЧАСТИ И АКСЕССУАРЫ"),
	Запчасти0(34,"Запчасти"),
	ШиныДискиКолёса(35,"Шины, диски и колёса"),
	АудиоИВидеотехника(36,"Аудио- и видеотехника"),
	Аксессуары(37,"Аксессуары"),
	Тюнинг(38,"Тюнинг"),
	БагажникиФаркопы(39,"Багажники и фаркопы"),
	Инструменты(40,"Инструменты"),
	Прицепы(41,"Прицепы"),
	Экипировка(42,"Экипировка"),
	АвтокосметикаАвтохимия(43,"Автокосметика и автохимия"),
	ПротивоугонныеУстройства(44,"Противоугонные устройства"),
	GPSнавигаторы(45,"GPS-навигаторы"),
	ЭЛЕКТРОНИКА(46,"ЭЛЕКТРОНИКА"),
	Телефоны(47,"Телефоны"),
	АудиоВидео(48,"Аудио и видео"),
	ТоварыДляКомпьютера(49,"Товары для компьютера"),
	ИгрыПриставкиПрограммы(50,"Игры, приставки и программы"),
	Ноутбуки(51,"Ноутбуки"),
	НастольныеКомпьютеры(52,"Настольные компьютеры"),
	Фототехника(53,"Фототехника"),
	ПланшетыИЭлектронныеКниги(54,"Планшеты и электронные книги"),
	Оргтехника(55,"Оргтехника и расходники"),
	ХОББИИОТДЫХ(56,"ХОББИ И ОТДЫХ"),
	БилетыИПутешествия(57,"Билеты и путешествия"),
	Велосипеды(58,"Велосипеды"),
	КнигиИЖурналы(59,"Книги и журналы"),
	Коллекционирование(60,"Коллекционирование"),
	МузыкальныеИнструменты(61,"Музыкальные инструменты"),
	ОхотаИРыбалка(62,"Охота и рыбалка"),
	СпортИОтдых(63,"Спорт и отдых"),
	ЖИВОТНЫЕ(64,"ЖИВОТНЫЕ"),
	Собаки(65,"Собаки"),
	Кошки(66,"Кошки"),
	Птицы(67,"Птицы"),
	Аквариум(68,"Аквариум"),
	ДругиеЖивотные(69,"Другие животные"),
	ТоварыДляЖивотных(70,"Товары для животных"),
	ГОТОВЫЙБИЗНЕСИОБОРУДОВАНИЕ(71,"ГОТОВЫЙ БИЗНЕС И ОБОРУДОВАНИЕ"),
	Готовыйбизнес(72,"Готовый бизнес"),
	ОборудованиеДляБизнеса(73,"Оборудование для бизнеса");


	private int id;
	private String title;


	CategorySearch(int id, String title) {
		this.id = id;
		this.title = title;

	}

	public String getTitle(){
		return title;
	}

	public int getId(){
		return id;
	}
}