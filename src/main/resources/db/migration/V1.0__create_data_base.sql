CREATE TABLE currencies(
    id int primary key,
    r030 int,
    code VARCHAR(3) NOT NULL,
    name VARCHAR(100) NOT NULL,
    created_at timestamp default CURRENT_TIMESTAMP
);

CREATE TABLE dates(
    id date primary key,
    status VARCHAR(30) NOT NULL,
    updated_at timestamp  NOT NULL,
    created_at timestamp  NOT NULL
);

CREATE TABLE currency_rates (
  date_id date,
  currency_id INT,
  rate decimal(15,8),
  PRIMARY KEY (date_id, currency_id),
  CONSTRAINT fk_date FOREIGN KEY(date_id) REFERENCES dates(id),
  CONSTRAINT fk_currency FOREIGN KEY(currency_id) REFERENCES currencies(id)
);

INSERT INTO currencies (id, r030, code, name) VALUES (36, 36,'AUD','Австралійський долар');
INSERT INTO currencies (id, r030, code, name) VALUES (124, 124,'CAD','Канадський долар');
INSERT INTO currencies (id, r030, code, name) VALUES (156, 156,'CNY','Юань Женьміньбі');
INSERT INTO currencies (id, r030, code, name) VALUES (203, 203,'CZK','Чеська крона');
INSERT INTO currencies (id, r030, code, name) VALUES (208, 208,'DKK','Данська крона');
INSERT INTO currencies (id, r030, code, name) VALUES (344, 344,'HKD','Гонконгівський долар');
INSERT INTO currencies (id, r030, code, name) VALUES (348, 348,'HUF','Форинт');
INSERT INTO currencies (id, r030, code, name) VALUES (356, 356,'INR','Індійська рупія');
INSERT INTO currencies (id, r030, code, name) VALUES (360, 360,'IDR','Рупія');
INSERT INTO currencies (id, r030, code, name) VALUES (376, 376,'ILS','Новий ізраїльський шекель');
INSERT INTO currencies (id, r030, code, name) VALUES (392, 392,'JPY','Єна');
INSERT INTO currencies (id, r030, code, name) VALUES (398, 398,'KZT','Теньге');
INSERT INTO currencies (id, r030, code, name) VALUES (410, 410,'KRW','Вона');
INSERT INTO currencies (id, r030, code, name) VALUES (484, 484,'MXN','Мексиканське песо');
INSERT INTO currencies (id, r030, code, name) VALUES (498, 498,'MDL','Молдовський лей');
INSERT INTO currencies (id, r030, code, name) VALUES (554, 554,'NZD','Новозеландський долар');
INSERT INTO currencies (id, r030, code, name) VALUES (578, 578,'NOK','Норвезька крона');
INSERT INTO currencies (id, r030, code, name) VALUES (643, 643,'RUB','Російський рубль');
INSERT INTO currencies (id, r030, code, name) VALUES (702, 702,'SGD','Сінгапурський долар');
INSERT INTO currencies (id, r030, code, name) VALUES (710, 710,'ZAR','Ренд');
INSERT INTO currencies (id, r030, code, name) VALUES (752, 752,'SEK','Шведська крона');
INSERT INTO currencies (id, r030, code, name) VALUES (756, 756,'CHF','Швейцарський франк');
INSERT INTO currencies (id, r030, code, name) VALUES (818, 818,'EGP','Єгипетський фунт');
INSERT INTO currencies (id, r030, code, name) VALUES (826, 826,'GBP','Фунт стерлінгів');
INSERT INTO currencies (id, r030, code, name) VALUES (840, 840,'USD','Долар США');
INSERT INTO currencies (id, r030, code, name) VALUES (933, 933,'BYN','Білоруський рубль');
INSERT INTO currencies (id, r030, code, name) VALUES (944, 944,'AZN','Азербайджанський манат');
INSERT INTO currencies (id, r030, code, name) VALUES (946, 946,'RON','Румунський лей');
INSERT INTO currencies (id, r030, code, name) VALUES (949, 949,'TRY','Турецька ліра');
INSERT INTO currencies (id, r030, code, name) VALUES (960, 960,'XDR','СПЗ (спеціальні права запозичення)');
INSERT INTO currencies (id, r030, code, name) VALUES (975, 975,'BGN','Болгарський лев');
INSERT INTO currencies (id, r030, code, name) VALUES (978, 978,'EUR','Євро');
INSERT INTO currencies (id, r030, code, name) VALUES (985, 985,'PLN','Злотий');
INSERT INTO currencies (id, r030, code, name) VALUES (12, 12,'DZD','Алжирський динар');
INSERT INTO currencies (id, r030, code, name) VALUES (50, 50,'BDT','Така');
INSERT INTO currencies (id, r030, code, name) VALUES (51, 51,'AMD','Вірменський драм');
INSERT INTO currencies (id, r030, code, name) VALUES (214, 214,'DOP','Домініканське песо');
INSERT INTO currencies (id, r030, code, name) VALUES (364, 364,'IRR','Іранський ріал');
INSERT INTO currencies (id, r030, code, name) VALUES (368, 368,'IQD','Іракський динар');
INSERT INTO currencies (id, r030, code, name) VALUES (417, 417,'KGS','Сом');
INSERT INTO currencies (id, r030, code, name) VALUES (422, 422,'LBP','Ліванський фунт');
INSERT INTO currencies (id, r030, code, name) VALUES (434, 434,'LYD','Лівійський динар');
INSERT INTO currencies (id, r030, code, name) VALUES (458, 458,'MYR','Малайзійський ринггіт');
INSERT INTO currencies (id, r030, code, name) VALUES (504, 504,'MAD','Марокканський дирхам');
INSERT INTO currencies (id, r030, code, name) VALUES (586, 586,'PKR','Пакистанська рупія');
INSERT INTO currencies (id, r030, code, name) VALUES (682, 682,'SAR','Саудівський ріял');
INSERT INTO currencies (id, r030, code, name) VALUES (704, 704,'VND','Донг');
INSERT INTO currencies (id, r030, code, name) VALUES (764, 764,'THB','Бат');
INSERT INTO currencies (id, r030, code, name) VALUES (784, 784,'AED','Дирхам ОАЕ');
INSERT INTO currencies (id, r030, code, name) VALUES (788, 788,'TND','Туніський динар');
INSERT INTO currencies (id, r030, code, name) VALUES (860, 860,'UZS','Узбецький сум');
INSERT INTO currencies (id, r030, code, name) VALUES (901, 901,'TWD','Новий тайванський долар');
INSERT INTO currencies (id, r030, code, name) VALUES (934, 934,'TMT','Туркменський новий манат');
INSERT INTO currencies (id, r030, code, name) VALUES (941, 941,'RSD','Сербський динар');
INSERT INTO currencies (id, r030, code, name) VALUES (972, 972,'TJS','Сомоні');
INSERT INTO currencies (id, r030, code, name) VALUES (981, 981,'GEL','Ларі');
INSERT INTO currencies (id, r030, code, name) VALUES (986, 986,'BRL','Бразильський реал');
INSERT INTO currencies (id, r030, code, name) VALUES (959, 959,'XAU','Золото');
INSERT INTO currencies (id, r030, code, name) VALUES (961, 961,'XAG','Срібло');
INSERT INTO currencies (id, r030, code, name) VALUES (962, 962,'XPT','Платина');
INSERT INTO currencies (id, r030, code, name) VALUES (964, 964,'XPD','Паладій');
