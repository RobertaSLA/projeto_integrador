insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (1, 'Delcina Basilio', '9323823540', '209-54-3572', '92825 Crowley Parkway', '76237-264');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (2, 'Skye McGurn', '8545206721', '883-27-9746', '38 Wayridge Place', '0091-3321');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (3, 'Rip Willimot', '9789643710', '334-21-6678', '435 Washington Way', '42549-492');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (4, 'Holden Gillfillan', '3533526125', '316-56-5874', '1530 Reinke Court', '44781-150');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (5, 'Erena McCarrick', '1666571613', '211-86-6041', '2523 Dunning Alley', '43063-218');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (6, 'Hebert Hambleton', '9969593791', '186-30-5353', '444 Charing Cross Parkway', '0115-4411');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (7, 'Uri Roubeix', '7112138618', '830-52-6069', '1924 Cambridge Pass', '49738-594');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (8, 'Berry Plaschke', '5052576383', '577-07-3615', '9137 Paget Parkway', '0054-0115');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (9, 'Ignacio Abdee', '6606895342', '148-34-4783', '8560 Hudson Plaza', '53773-001');
insert into Cliente (idCliente, Nome, Telefone, CPF, Endereco, CEP) values (10, 'Laural Saye', '2771693834', '481-58-0415', '684 Esch Drive', '53489-677');

insert into Autor (IdAutor, Nome) values (338, 'Fairlie Marks');
insert into Autor (IdAutor, Nome) values (457, 'Eddy Goudard');
insert into Autor (IdAutor, Nome) values (328, 'Dinny Mattersey');
insert into Autor (IdAutor, Nome) values (187, 'Brandtr Warstall');
insert into Autor (IdAutor, Nome) values (129, 'Morlee Shelmardine');
insert into Autor (IdAutor, Nome) values (262, 'Booth Mark');
insert into Autor (IdAutor, Nome) values (118, 'Malcolm Tully');
insert into Autor (IdAutor, Nome) values (232, 'Jamal Girkin');
insert into Autor (IdAutor, Nome) values (175, 'Rosabel Albiston');
insert into Autor (IdAutor, Nome) values (388, 'Angel Ling');

insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (4744, 5652, 15, '$138.90', 'Tambee', '13/06/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (1057, 5124, 18, '$117.64', 'Tagopia', '30/11/2021');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (1203, 5540, 4, '$266.06', 'Edgeify', '23/09/2021');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (2442, 7186, 20, '$153.48', 'Demivee', '13/05/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (2918, 548, 28, '$499.36', 'Demimbu', '20/10/2021');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (1236, 2819, 22, '$329.63', 'Meemm', '31/03/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (778, 1161, 21, '$375.52', 'Zazio', '07/04/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (3441, 2637, 26, '$253.99', 'Jatri', '21/01/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (1356, 5437, 20, '$497.41', 'Fivebridge', '10/08/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (4928, 3654, 2, '$204.56', 'Flipopia', '28/09/2021');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (1369, 6389, 21, '$212.84', 'Tagfeed', '08/02/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (4017, 675, 9, '$398.18', 'Gabtune', '27/11/2021');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (688, 2306, 12, '$146.62', 'Oodoo', '03/02/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (4237, 9263, 24, '$185.33', 'Photofeed', '13/05/2022');
insert into Compra (IdCompra, SKU, Quantidade, Valor, Fornecedor, Data) values (835, 4501, 25, '$414.88', 'Shuffledrive', '12/08/2022');

insert into Devolucao (codDevolucao, idProduto, idVenda, Motivo, Data) values (5357, 5604, 8877, 'Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum.', '24/08/2022');
insert into Devolucao (codDevolucao, idProduto, idVenda, Motivo, Data) values (389, 2974, 5825, 'Nulla nisl. Nunc nisl.', '05/07/2022');
insert into Devolucao (codDevolucao, idProduto, idVenda, Motivo, Data) values (573, 2935, 8435, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue. Vestibulum rutrum rutrum neque.', '17/10/2021');
insert into Devolucao (codDevolucao, idProduto, idVenda, Motivo, Data) values (1520, 3344, 5881, 'Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla.', '08/02/2022');
insert into Devolucao (codDevolucao, idProduto, idVenda, Motivo, Data) values (7520, 2664, 4910, 'Morbi non lectus.', '02/09/2021');

insert into HistoricoDePrecos (IdHistoricoDePrecos, DataAlteracao, Preco) values (586, '23/07/2022', '$20.26');
insert into HistoricoDePrecos (IdHistoricoDePrecos, DataAlteracao, Preco) values (380, '20/03/2022', '$30.30');
insert into HistoricoDePrecos (IdHistoricoDePrecos, DataAlteracao, Preco) values (358, '11/05/2022', '$27.33');
insert into HistoricoDePrecos (IdHistoricoDePrecos, DataAlteracao, Preco) values (384, '24/04/2022', '$22.44');
insert into HistoricoDePrecos (IdHistoricoDePrecos, DataAlteracao, Preco) values (565, '09/09/2021', '$13.57');

insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (9528, '317520929-7', 'Doctor and the Devils, The', 'Hoeger-Shanahan', 5, 'Ação', 20.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (5737, '722980865-0', 'Back to the Future Part III', 'MacGyver-Nitzsche', 18, 'Romance', 15.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (7145, '500689995-6', 'Lacombe Lucien', 'Predovic, Hegmann and Cassin', 9, 'Ficção Científica', 10.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (4602, '984460768-X', 'Step Up 3D', 'Hegmann, Sanford and Little', 16, 'Infantil', 17.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (2264, '757463261-8', 'Turin Horse, The (A Torinói ló)', 'Murray-Blick', 28, 'Gastronomia', 39.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (2693, '979530424-0', 'The Red Inn', 'Lueilwitz-Abernathy', 6, 'Ação', 50.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (1374, '449833111-7', 'Internship, The', 'Lesch, Green and Osinski', 0, 'Romance', 59.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (1897, '925550478-9', 'Patrik Age 1.5 (Patrik 1,5)', 'Bartoletti, Klein and Williamson', 1, 'Gastronomia', 79.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (8492, '942487661-0', 'From Up on Poppy Hill (Kokuriko-zaka kara)', 'Shields, Wilkinson and Ward', 18, 'Ficção Científica', 35.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (1772, '989906771-7', 'Moonwalker', 'Hintz, Mosciski and Tremblay', 18, 'Infantil', 44.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (8337, '902676563-0', 'Debt, The', 'Parisian, Shields and Roob', 0, 'Romance', 38.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (8011, '614916874-3', 'The Magical Legend of the Leprechauns', 'Reynolds-Purdy', 1, 'Ficção Científica', 42.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (4699, '832517274-6', 'Food of Love (Manjar de Amor)', 'Renner-Beahan', 26, 'Gastronomia', 31.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (7284, '103622114-8', 'One Missed Call (Chakushin ari)', 'Schuster Inc', 19, 'Terror', 63.99);
insert into Livro (SKU, ISBN, Nome, Editora, Estoque, Genero, Preco) values (8178, '127493136-3', 'Grand Day Out with Wallace and Gromit, A', 'Towne-Brakus', 27, 'Terror', 25.99);

insert into Livro_has_Venda (Quantidade) values (45);
insert into Livro_has_Venda (Quantidade) values (22);
insert into Livro_has_Venda (Quantidade) values (39);
insert into Livro_has_Venda (Quantidade) values (26);
insert into Livro_has_Venda (Quantidade) values (28);
insert into Livro_has_Venda (Quantidade) values (26);
insert into Livro_has_Venda (Quantidade) values (44);
insert into Livro_has_Venda (Quantidade) values (20);
insert into Livro_has_Venda (Quantidade) values (48);
insert into Livro_has_Venda (Quantidade) values (42);

insert into Livro_Venda (QuantidadeItem) values (21);
insert into Livro_Venda (QuantidadeItem) values (42);
insert into Livro_Venda (QuantidadeItem) values (37);
insert into Livro_Venda (QuantidadeItem) values (44);
insert into Livro_Venda (QuantidadeItem) values (28);
insert into Livro_Venda (QuantidadeItem) values (17);
insert into Livro_Venda (QuantidadeItem) values (8);
insert into Livro_Venda (QuantidadeItem) values (16);
insert into Livro_Venda (QuantidadeItem) values (25);
insert into Livro_Venda (QuantidadeItem) values (33);

insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (573, 'atorre0', 'Arie Torre', 'atorre0@webs.com', 'N4knKrbnfn', 'TRUE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (470, 'cedgley1', 'Clare Edgley', 'cedgley1@domainmarket.com', 'eMQSpDOSNA2', 'FALSE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (922, 'sheathcott2', 'Sam Heathcott', 'sheathcott2@delicious.com', 'OJ0jJcOHh1', 'FALSE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (932, 'amcgurn3', 'Ardelle McGurn', 'amcgurn3@mtv.com', '4rTtjMrx2SO', 'FALSE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (281, 'kthorlby4', 'Kory Thorlby', 'kthorlby4@bloglines.com', 'IWABUeXXMe', 'FALSE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (235, 'wcuell5', 'Wendall Cuell', 'wcuell5@xrea.com', 'SCrUU7BSDcT', 'FALSE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (154, 'ybleazard6', 'Ysabel Bleazard', 'ybleazard6@ycombinator.com', 'bidq10TWz', 'FALSE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (778, 'jguichard7', 'Jerry Guichard', 'jguichard7@tuttocitta.it', 'W0qBnni', 'FALSE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (493, 'mbreinlein8', 'Moselle Breinlein', 'mbreinlein8@imdb.com', 'JXxVl8', 'FALSE');
insert into Usuario (idUsuario, User, Nome, Email, Senha, Admnistrador) values (242, 'hros9', 'Hillery Ros', 'hros9@wikipedia.org', 'YndTD9F', 'FALSE');

insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (94, 1, 'mastercard', '17/08/2022', '$23.32');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (26, 2, 'mastercard', '30/11/2021', '$49.55');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (49, 3, 'mastercard', '26/06/2022', '$44.72');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (44, 4, 'mastercard', '16/04/2022', '$41.43');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (69, 5, 'mastercard', '01/08/2022', '$27.43');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (87, 6, 'mastercard', '09/11/2021', '$11.72');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (85, 7, 'mastercard', '19/01/2022', '$30.82');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (80, 8, 'mastercard', '21/09/2021', '$38.58');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (39, 9, 'mastercard', '21/03/2022', '$5.37');
insert into Venda (idVenda, SKULivro, FormaPagamento, Data, Valor) values (53, 10, 'mastercard', '11/05/2022', '$17.72');

insert into Vendedor (idVendedor, Comissao, Nome, Endereco, CEP, CPF, Telefone) values (1, 1, 'Mannie McGrotty', '06555 Eagan Street', '51270-111', '662-95-8833', '1346200102');
insert into Vendedor (idVendedor, Comissao, Nome, Endereco, CEP, CPF, Telefone) values (2, 2, 'Nye Clac', '59252 Evergreen Crossing', '49349-718', '135-24-1204', '4353184267');
insert into Vendedor (idVendedor, Comissao, Nome, Endereco, CEP, CPF, Telefone) values (3, 3, 'Clair Cornelius', '9 Gateway Parkway', '37012-994', '419-75-3208', '9699054276');
insert into Vendedor (idVendedor, Comissao, Nome, Endereco, CEP, CPF, Telefone) values (4, 4, 'Kim Borit', '30 Arrowood Alley', '55111-529', '376-11-0018', '8686278448');
insert into Vendedor (idVendedor, Comissao, Nome, Endereco, CEP, CPF, Telefone) values (5, 5, 'Carolin Reimer', '53 Butternut Way', '58118-5016', '258-16-7631', '1063314593');

insert into Fornecedor (CNPJ, Razao_Social, Endereco, email, telefone) values ('0886553067', 'Nuveen Short Duration Credit Opportunities Fund', '1489 Park Meadow Lane', 'rgreatreax0@sitemeter.com', '(803) 9598473');
insert into Fornecedor (CNPJ, Razao_Social, Endereco, email, telefone) values ('8224755177', 'KB Financial Group Inc', '553 Bluestem Court', 'eprivost1@java.com', '(849) 9046648');
insert into Fornecedor (CNPJ, Razao_Social, Endereco, email, telefone) values ('3725588546', 'Astec Industries, Inc.', '1700 Brown Road', 'sstibbs2@desdev.cn', '(566) 7233472');
insert into Fornecedor (CNPJ, Razao_Social, Endereco, email, telefone) values ('1190718715', 'Blackrock MuniYield Pennsylvania Quality Fund', '03853 Hayes Pass', 'rjoslin3@blinklist.com', '(481) 1705779');
insert into Fornecedor (CNPJ, Razao_Social, Endereco, email, telefone) values ('8461886372', 'Verizon Communications Inc.', '909 Truax Place', 'mparham4@flickr.com', '(336) 3031398');
insert into Fornecedor (CNPJ, Razao_Social, Endereco, email, telefone) values ('7399022399', 'Zimmer Biomet Holdings, Inc.', '36 Duke Road', 'wwace5@godaddy.com', '(411) 9435170');
insert into Fornecedor (CNPJ, Razao_Social, Endereco, email, telefone) values ('9258970160', 'AnaptysBio, Inc.', '3532 Eastwood Trail', 'sdionisetti6@imgur.com', '(834) 5359615');
insert into Fornecedor (CNPJ, Razao_Social, Endereco, email, telefone) values ('9776094880', 'Ramco-Gershenson Properties Trust', '5514 Loeprich Circle', 'tcarnihan7@so-net.ne.jp', '(491) 1645910');
