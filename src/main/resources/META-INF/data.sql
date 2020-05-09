INSERT INTO Category (id, name) VALUES (1,'baked_dish');
INSERT INTO Category (id, name) VALUES (2,'beef');
INSERT INTO Category (id, name) VALUES (3,'chicken');
INSERT INTO Category (id, name) VALUES (4,'dinner');
INSERT INTO Category (id, name) VALUES (5,'easy');
INSERT INTO Category (id, name) VALUES (6,'healthy');
INSERT INTO Category (id, name) VALUES (7,'kid_friendly');
INSERT INTO Category (id, name) VALUES (8,'quick');
INSERT INTO Category (id, name) VALUES (9,'vegetables');

INSERT INTO Food (id, name, image, recipe, category_id) VALUES (1,'magyaros tepsis krumpli','magyaros_tepsis_krumpli_1.jpg', '/baked_dish/magyaros_tepsis_krumpli_szoveg_1.txt', 1);
INSERT INTO Food (id, name, image, recipe, category_id) VALUES (2,'olaszos szoszban sult tepsis csirke','olaszos_szoszban_sult_tepsis_csirke_1.jpg', '/baked_dish/olaszos_szoszban_sult_tepsis_csirke_szoveg_1.txt', 1);
INSERT INTO Food (id, name, image, recipe, category_id) VALUES (3,'sult marhaszelet vorosboros gombaraguval','sult_marhaszelet_vorosboros_gombaraguval_2.jpg', '/beef/sult_marhaszelet_vorosboros_gombaraguval_szoveg_2.txt', 2);
INSERT INTO Food (id, name, image, recipe, category_id) VALUES (5,'pacolt csirkemellfile baconben sutve','pacolt_csirkemellfile_baconben_sutve_3.jpg', '/chicken/pacolt_csirkemellfile_baconben_sutve_szoveg_3.txt', 3);
INSERT INTO Food (id, name, image, recipe, category_id) VALUES (6,'mexikoi csipos tortilla leves','mexikoi_csipos_tortilla_leves_4.jpg', '/dinner/mexikoi_csipos tortilla_leves_szoveg_4.txt', 4);