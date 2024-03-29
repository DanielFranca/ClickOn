package com.example.clickon.DiagnosticPhone

import PhoneItem
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.Cards.CardsPhone.AppleActivity
import com.example.clickon.Cards.CardsPhone.MotorolaActivity
import com.example.clickon.Cards.CardsPhone.SamsungActivity
import com.example.clickon.Cards.CardsPhone.XiaomiActivity
import com.example.clickon.DiagnosticGeral.PhoneDetailsActivityScreen
import com.example.clickon.R


class DiagnosticBrokenScreen : AppCompatActivity() {

    private lateinit var phoneList: List<PhoneItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modelphone)
        supportActionBar?.hide()



        val phoneSuggestions = listOf(
            //Phones Apple
            PhoneItem(1, " Iphone 6s - 16gb", "Apple", R.drawable.iphone6_16gb),
            PhoneItem(2, " Iphone 6s Plus - 32gb", "Apple", R.drawable.iphone6_32gb),
            PhoneItem(3, " Iphone SE - 32gb", "Apple", R.drawable.iphone_se_32gb),
            PhoneItem(4, " Iphone SE - 64gb", "Apple", R.drawable.iphone_se_64gb),
            PhoneItem(5, " Iphone SE - 128gb", "Apple", R.drawable.iphone_se_2020_128gb),
            PhoneItem(6, " Iphone 7 - 32gb ", "Apple", R.drawable.iphone7_32gb),
            PhoneItem(7, " Iphone 7 - 64gb ", "Apple", R.drawable.iphone7_32gb),
            PhoneItem(8, " Iphone 7 Plus - 128gb ", "Apple", R.drawable.iphone_7plus_128gb),
            PhoneItem(9, " Iphone 8 - 64gb", "Apple", R.drawable.iphone8_64gb),
            PhoneItem(10, " Iphone 8 Plus - 256gb", "Apple", R.drawable.iphone8_256gb),
            PhoneItem(11, " Iphone X - 64gb", "Apple", R.drawable.iphonex_64gb),
            PhoneItem(12, " Iphone X - 256gb", "Apple", R.drawable.iphonex_256gb),
            PhoneItem(13, " Iphone XR - 128gb", "Apple", R.drawable.iphonexr_128gb),
            PhoneItem(14, " Iphone XR - 256gb", "Apple", R.drawable.iphonexr_256gb),
            PhoneItem(15, " Iphone XS - 128gb", "Apple", R.drawable.iphonexs_128gb),
            PhoneItem(16, " Iphone XS MAX - 512gb", "Apple", R.drawable.iphonexsmax_512gb),
            PhoneItem(17, " Iphone 11 - 128gb", "Apple", R.drawable.iphone11_128gb),
            PhoneItem(18, " Iphone 11 - 256gb", "Apple", R.drawable.iphone11_256gb),
            PhoneItem(19, " Iphone 11 PRO - 256gb", "Apple", R.drawable.iphone11_pro_256),
            PhoneItem(20, " Iphone 11 PRO MAX - 512gb", "Apple", R.drawable.iphone11_promax_512gb),
            PhoneItem(21, " Iphone SE (2020) - 64gb", "Apple", R.drawable.iphone_se_2020_64gb),
            PhoneItem(22, " Iphone SE (2020) - 128gb", "Apple", R.drawable.iphone_se_2020_128gb),
            PhoneItem(23, " Iphone SE (2020) - 256gb", "Apple", R.drawable.iphonese_256gb_2020),
            PhoneItem(24, " Iphone 12 - 64gb", "Apple", R.drawable.iphone12_64gb),
            PhoneItem(25, " Iphone 12 - 128gb", "Apple", R.drawable.iphone12_128gb),
            PhoneItem(26, " Iphone 12 - 256gb", "Apple", R.drawable.iphone_12_256gb),
            PhoneItem(27, " Iphone 12 Mini - 64gb", "Apple", R.drawable.iphone12_mini_64gb),
            PhoneItem(28, " Iphone 12 Mini - 128gb", "Apple", R.drawable.iphone12_mini_128gb),
            PhoneItem(29, " Iphone 12 Mini - 256gb", "Apple", R.drawable.iphone_12_256gb),
            PhoneItem(30, " Iphone 12 Pro - 128gb", "Apple", R.drawable.iphone12_pro_128gb),
            PhoneItem(31, " Iphone 12 Pro - 256gb", "Apple", R.drawable.iphone_12_256gb),
            PhoneItem(32, " Iphone 12 Pro MAX - 512gb", "Apple", R.drawable.iphone12_pro_max_512gb),
            PhoneItem(33, " Iphone 13 - 128gb", "Apple", R.drawable.iphone13_128gb),
            PhoneItem(34, " Iphone 13 - 256gb", "Apple", R.drawable.iphone13_256gb),
            PhoneItem(35, " Iphone 13 - 512gb", "Apple", R.drawable.iphone13_512gb),
            PhoneItem(36, " Iphone 13 Mini - 128gb", "Apple", R.drawable.iphone13_mini),
            PhoneItem(37, " Iphone 13 Mini - 256gb", "Apple", R.drawable.iphone13_mini_256gb),
            PhoneItem(38, " Iphone 13 Mini - 512gb", "Apple", R.drawable.iphone13_mini_512gb),
            PhoneItem(39, " Iphone 13 PRO - 128gb", "Apple", R.drawable.iphone13_promax_128gb),
            PhoneItem(40, " Iphone 13 PRO - 256gb", "Apple", R.drawable.iphone13_256gb),
            PhoneItem(41, " Iphone 13 PRO - 512gb", "Apple", R.drawable.iphone13_512gb),
            PhoneItem(42, " Iphone 13 PRO - 1TB", "Apple", R.drawable.iphone13_promax_1tb),
            PhoneItem(43, " Iphone 13 PRO MAX - 128gb", "Apple", R.drawable.iphone13_promax_128gb),
            PhoneItem(44, " Iphone 13 PRO MAX - 256gb", "Apple", R.drawable.iphone13_promax_256gb),
            PhoneItem(45, " Iphone 13 PRO MAX - 512gb", "Apple", R.drawable.iphone13_promax_512gb),
            PhoneItem(46, " Iphone 13 PRO MAX - 1TB", "Apple", R.drawable.iphone13_promax_1tb),
            PhoneItem(47, " Iphone SE (2022) - 64gb", "Apple", R.drawable.iphone_se_64gb),
            PhoneItem(48, " Iphone SE (2022) - 128gb", "Apple", R.drawable.iphone_se_2020_128gb),
            PhoneItem(49, " Iphone SE (2022) - 256gb", "Apple", R.drawable.iphonese_256gb_2020),
            PhoneItem(50, " Iphone 14 - 128gb", "Apple", R.drawable.iphone14_128gb),
            PhoneItem(51, " Iphone 14 - 256gb", "Apple", R.drawable.iphone14_256gb),
            PhoneItem(52, " Iphone 14 - 512gb", "Apple", R.drawable.iphone14_512gb),
            PhoneItem(53, " Iphone 14 Plus - 128gb", "Apple", R.drawable.iphone14_plus_128gb),
            PhoneItem(54, " Iphone 14 Plus - 256gb", "Apple", R.drawable.iphone14_plus_256gb),
            PhoneItem(55, " Iphone 14 Plus- 512gb", "Apple", R.drawable.iphone14_promax_512gb),
            PhoneItem(56, " Iphone 14 Pro - 128gb", "Apple", R.drawable.iphone14_pro128gb),
            PhoneItem(57, " Iphone 14 Pro - 256gb", "Apple", R.drawable.iphone14_plus_256gb),
            PhoneItem(58, " Iphone 14 Pro - 512gb", "Apple", R.drawable.iphone14_pro_512gb),
            PhoneItem(59, " Iphone 14 Pro - 1TB", "Apple", R.drawable.iphone14_pro_1tb),
            PhoneItem(60, " Iphone 14 PRO MAX - 128gb", "Apple", R.drawable.iphone14_promax_128gb),
            PhoneItem(61, " Iphone 14 PRO MAX - 256gb", "Apple", R.drawable.iphone14_plus_256gb),
            PhoneItem(62, " Iphone 14 PRO MAX - 512gb", "Apple", R.drawable.iphone14_promax_512gb),
            PhoneItem(63, " Iphone 14 PRO MAX - 1TB", "Apple", R.drawable.iphone14_promax_1tb),


            //Phones Xiaomi
            PhoneItem(64, "MI 10 Lite ", "Xiaomi", R.drawable.mi10_lite),
            PhoneItem(65, "MI 10 Lite Zoom", "Xiaomi", R.drawable.mi10lite_zoom),
            PhoneItem(66, "Black Shark", "Xiaomi", R.drawable.blackshark3),
            PhoneItem(67, "MI 10 Ultra", "Xiaomi", R.drawable.mi10_ultra),
            PhoneItem(68, "MI 10S", "Xiaomi", R.drawable.mi10s),
            PhoneItem(69, "Black Shark 4 PRO ", "Xiaomi", R.drawable.blackshark4pro),
            PhoneItem(70, "MI 11 Ultra ", "Xiaomi", R.drawable.mi11ultra),
            PhoneItem(71, "MI Mix Fold ", "Xiaomi", R.drawable.mimixfold),
            PhoneItem(72, "MI 11X Pro", "Xiaomi", R.drawable.mi11xpro),
            PhoneItem(73, "MI 11X", "Xiaomi", R.drawable.mi11x),
            PhoneItem(74, "MI Mix 4", "Xiaomi", R.drawable.mimix4),
            PhoneItem(75, "Civi", "Xiaomi", R.drawable.civi1s),
            PhoneItem(76, "Black Shark 4S PRO", "Xiaomi", R.drawable.blackshark4pro),
            PhoneItem(77, "11i", "Xiaomi", R.drawable.mi11i),
            PhoneItem(78, "11i HyperCharge", "Xiaomi", R.drawable.hypercharge11i),
            PhoneItem(79, "12 PRO", "Xiaomi", R.drawable.mi12pro),
            PhoneItem(80, "Black Shark 5", "Xiaomi", R.drawable.blackshark5),
            PhoneItem(81, "Black Shark 5 RS", "Xiaomi", R.drawable.blackshark5rs),
            PhoneItem(82, "Civi 1S", "Xiaomi", R.drawable.civi1s),
            PhoneItem(83, "12S Ultra", "Xiaomi", R.drawable.mi12sultra),
            PhoneItem(84, "12S", "Xiaomi", R.drawable.mi12s),
            PhoneItem(85, " 12S PRO", "Xiaomi", R.drawable.mi12spro),
            PhoneItem(86, " 12S PRO (MediaTek)", "Xiaomi", R.drawable.s12mediatek),
            PhoneItem(87, " Mix Fold 2", "Xiaomi", R.drawable.mixfold2),
            PhoneItem(88, " Civi 2", "Xiaomi", R.drawable.civi2),
            PhoneItem(89, " 13 PRO", "Xiaomi", R.drawable.mi13pro),
            PhoneItem(90, " 13", "Xiaomi", R.drawable.mi13),
            PhoneItem(91, " MI 9 Lite", "Xiaomi", R.drawable.mi10s),
            PhoneItem(92, " MI Note 10 PRO", "Xiaomi", R.drawable.minote10pro),
            PhoneItem(93, " MI 11", "Xiaomi", R.drawable.mi11),
            PhoneItem(94, " Black Shark 3", "Xiaomi", R.drawable.blackshark3),
            PhoneItem(95, " MI 10T PRO", "Xiaomi", R.drawable.mi10tpro),
            PhoneItem(96, " MI Note 10 Lite", "Xiaomi", R.drawable.minote10lite),
            PhoneItem(97, " Black Shark 4", "Xiaomi", R.drawable.blackshark4),
            PhoneItem(98, " MI 10T Lite", "Xiaomi", R.drawable.mi10tlite),
            PhoneItem(99, " 11T", "Xiaomi", R.drawable.mi11t),
            PhoneItem(99, " Mi 11i", "Xiaomi", R.drawable.mi11i),
            PhoneItem(100, " MI 10T", "Xiaomi", R.drawable.mi10t),
            PhoneItem(101, " 12", "Xiaomi", R.drawable.mi12),
            PhoneItem(102, " 12T", "Xiaomi", R.drawable.mi12t),
            PhoneItem(103, " Black Shark 5 PRO", "Xiaomi", R.drawable.blackshark5pro),
            PhoneItem(104, " 12X ", "Xiaomi", R.drawable.mi12x),
            PhoneItem(103, " MI 11 Lite ", "Xiaomi", R.drawable.mi11lite),
            PhoneItem(104, " MI 11 Lite 5G", "Xiaomi", R.drawable.mi11lite5g),
            PhoneItem(105, " 11 Lite NE", "Xiaomi", R.drawable.mi11lite),
            PhoneItem(106, " 12 Lite ", "Xiaomi", R.drawable.mi12lite),
            PhoneItem(107, " 11T PRO", "Xiaomi", R.drawable.mi11tpro),
            PhoneItem(108, " 12T PRO", "Xiaomi", R.drawable.mi12tpro),
            PhoneItem(109, " MI 11 PRO", "Xiaomi", R.drawable.mi11tpro),

            //Phones Motorola
            PhoneItem(110, " Moto G53", "Motorola", R.drawable.moto_g53),
            PhoneItem(111, " Moto G73", "Motorola", R.drawable.moto_g73),
            PhoneItem(112, " Moto E13", "Motorola", R.drawable.moto_e13),
            PhoneItem(113, " Moto G23", "Motorola", R.drawable.moto_g23),
            PhoneItem(114, " Moto G13", "Motorola", R.drawable.moto_g13),
            PhoneItem(116, " Moto E22i ", "Motorola", R.drawable.moto_e22i),
            PhoneItem(117, " Moto G72 ", "Motorola", R.drawable.moto_g72),
            PhoneItem(118, " Moto E22", "Motorola", R.drawable.moto_e22),
            PhoneItem(119, " Moto Edge 30", "Motorola", R.drawable.moto_edge30),
            PhoneItem(120, " Moto Edge 30 Fusion", "Motorola", R.drawable.moto_edge30fusion),
            PhoneItem(121, " Moto Edge 30 Neo", "Motorola", R.drawable.moto_edge30neo),
            PhoneItem(122, " Moto Edge 30 Ultra", "Motorola", R.drawable.moto_edge30ultra),
            PhoneItem(123, " Moto E22s", "Motorola", R.drawable.moto_e22s),
            PhoneItem(124, " Moto X30 Pro", "Motorola", R.drawable.moto_x30pro),
            PhoneItem(125, " Moto S30 Pro", "Motorola", R.drawable.moto_s30pro),
            PhoneItem(126, " Moto G32", "Motorola", R.drawable.moto_g32),
            PhoneItem(127, " Moto G62", "Motorola", R.drawable.moto_g62),
            PhoneItem(128, " Moto G42", "Motorola", R.drawable.moto_g42),
            PhoneItem(129, " Moto G52j", "Motorola", R.drawable.moto_g52j),
            PhoneItem(130, " Moto G71s", "Motorola", R.drawable.moto_g71s),
            PhoneItem(131, " Moto G82", "Motorola", R.drawable.moto_g82),
            PhoneItem(132, " Moto E32", "Motorola", R.drawable.moto_e32),
            PhoneItem(133, " Moto G200 5G", "Motorola", R.drawable.moto_g200),
            PhoneItem(134, " Moto G41", "Motorola", R.drawable.moto_g41),
            PhoneItem(135, " Moto G31", "Motorola", R.drawable.moto_g31),
            PhoneItem(136, " Moto G51", "Motorola", R.drawable.moto_g51),
            PhoneItem(137, " Moto E40", "Motorola", R.drawable.moto_e40),
            PhoneItem(138, " Moto E30", "Motorola", R.drawable.moto_e30),
            PhoneItem(139, " Moto E20 ", "Motorola", R.drawable.moto_e20),
            PhoneItem(140, " Moto Edge S Lite", "Motorola", R.drawable.moto_edge_s_lite),
            PhoneItem(141, " Moto Edge S Pro", "Motorola", R.drawable.moto_edge_s_pro),
            PhoneItem(142, " Moto Edge 20", "Motorola", R.drawable.moto_edge_20),
            PhoneItem(143, " Moto Edge 20 Lite", "Motorola", R.drawable.moto_edge20_lite),
            PhoneItem(144, " Moto Edge 20 Pro", "Motorola", R.drawable.moto_edge20_pro),
            PhoneItem(145, " Moto One 5G", "Motorola", R.drawable.moto_one_5g),
            PhoneItem(146, " Moto G60", "Motorola", R.drawable.moto_g60),
            PhoneItem(147, " Moto E7i", "Motorola", R.drawable.moto_e7i),
            PhoneItem(148, " Moto G100", "Motorola", R.drawable.moto_g100),
            PhoneItem(149, " Moto G10 Power", "Motorola", R.drawable.moto_g10power),
            PhoneItem(150, " Moto Edge S", "Motorola", R.drawable.moto_edge_s),
            PhoneItem(152, " Moto G Power", "Motorola", R.drawable.moto_gpower),
            PhoneItem(153, " Moto G9 Power", "Motorola", R.drawable.moto_g9power),
            PhoneItem(155, " Moto G9 Plus", "Motorola", R.drawable.moto_g9plus),
            PhoneItem(156, " Moto G9 Play", "Motorola", R.drawable.moto_g9play),
            PhoneItem(157, " Moto G9", "Motorola", R.drawable.moto_g9play),
            PhoneItem(158, " Moto One Vision Plus", "Motorola", R.drawable.moto_onevisionplus),
            PhoneItem(159, " Moto G 5G Plus", "Motorola", R.drawable.moto_5g_plus),
            PhoneItem(160, " Moto One Fusion", "Motorola", R.drawable.moto_one_fusion),
            PhoneItem(161, " Moto G Fast", "Motorola", R.drawable.moto_g_fast),
            PhoneItem(162, " Moto Edge+ ", "Motorola", R.drawable.moto_edgemais),
            PhoneItem(163, " Moto G8 Power Lite", "Motorola", R.drawable.moto_g8_powerlite),
            PhoneItem(165, " Moto E6s", "Motorola", R.drawable.moto_e6s),
            PhoneItem(166, " Moto G8", "Motorola", R.drawable.moto_g8),
            PhoneItem(167, " Moto G8 Power", "Motorola", R.drawable.moto_g8power),
            PhoneItem(168, " Moto G8 Plus", "Motorola", R.drawable.moto_g8plus),
            PhoneItem(169, " Moto G8 Play", "Motorola", R.drawable.moto_g8play),
            PhoneItem(170, " Moto One Macro", "Motorola", R.drawable.moto_onemacro),
            PhoneItem(171, " Moto One Zoom", "Motorola", R.drawable.moto_onezoom),
            PhoneItem(172, " Moto One Action", "Motorola", R.drawable.moto_oneaction),
            PhoneItem(173, " Moto E5 Plus", "Motorola", R.drawable.moto_e5plus),
            PhoneItem(174, " Moto G7 Play", "Motorola", R.drawable.moto_g7play),
            PhoneItem(175, " Moto G7 Power", "Motorola", R.drawable.motog7_power),
            PhoneItem(177, " Moto One Power", "Motorola", R.drawable.moto_onepower),
            PhoneItem(178, " Moto Z3", "Motorola", R.drawable.moto_z3),
            PhoneItem(179, " Moto G6 Play", "Motorola", R.drawable.moto_g6play),
            PhoneItem(180, " Moto G6 Plus", "Motorola", R.drawable.moto_g6plus),
            PhoneItem(181, " Moto G5S", "Motorola", R.drawable.moto_g5s),
            PhoneItem(182, " Moto G5", "Motorola", R.drawable.moto_g5),
            PhoneItem(183, " Moto C ", "Motorola", R.drawable.moto_c),
            PhoneItem(184, " Moto C Plus", "Motorola", R.drawable.moto_cplus),

            //Phones Samsung
            PhoneItem(185, " Galaxy A3 ", "Samsung", R.drawable.galaxy_a3),
            PhoneItem(186, " Galaxy A5 ", "Samsung", R.drawable.galaxy_a5),
            PhoneItem(187, " Galaxy A7 ", "Samsung", R.drawable.galaxy_a7),
            PhoneItem(188, " Galaxy A8 ", "Samsung", R.drawable.galaxy_a8),
            PhoneItem(189, " Galaxy A8+ ", "Samsung", R.drawable.galaxy_a8mais),
            PhoneItem(200, " Galaxy C5 Pro", "Samsung", R.drawable.galaxy_c5pro),
            PhoneItem(201, " Galaxy C7", "Samsung", R.drawable.galaxy_c7),
            PhoneItem(202, " Galaxy J2", "Samsung", R.drawable.galaxy_j2),
            PhoneItem(203, " Galaxy J3", "Samsung", R.drawable.galaxy_j3),
            PhoneItem(204, " Galaxy J3 Emerge ", "Samsung", R.drawable.galaxy_j3emerge),
            PhoneItem(205, " Galaxy J5 ", "Samsung", R.drawable.galaxy_j5),
            PhoneItem(206, " Galaxy J7", "Samsung", R.drawable.galaxy_j7),
            PhoneItem(207, " Galaxy J7 Max", "Samsung", R.drawable.galaxy_j7max),
            PhoneItem(208, " Galaxy J7 Nxt", "Samsung", R.drawable.galaxy_j7nxt),
            PhoneItem(209, " Galaxy J7 V", "Samsung", R.drawable.galaxy_j7v),
            PhoneItem(210, " Galaxy Note 8", "Samsung", R.drawable.galaxy_note8),
            PhoneItem(211, " Galaxy Note FE", "Samsung", R.drawable.galaxy_notefe),
            PhoneItem(212, " Galaxy S8", "Samsung", R.drawable.galaxy_s8),
            PhoneItem(213, " Galaxy S8 Active", "Samsung", R.drawable.galaxy_s8_active),
            PhoneItem(214, " Galaxy S8+ ", "Samsung", R.drawable.galaxy_s8mais),
            PhoneItem(215, " Galaxy A6 ", "Samsung", R.drawable.galaxy_a6),
            PhoneItem(216, " Galaxy A6+ ", "Samsung", R.drawable.galaxy_a6mais),
            PhoneItem(217, " Galaxy A6s ", "Samsung", R.drawable.galaxy_a6s),
            PhoneItem(218, " Galaxy A7 ", "Samsung", R.drawable.galaxy_a7),
            PhoneItem(219, " Galaxy A8 Star", "Samsung", R.drawable.galaxy_a8),
            PhoneItem(220, " Galaxy A8s ", "Samsung", R.drawable.galaxy_a8s),
            PhoneItem(221, " Galaxy A9 ", "Samsung", R.drawable.galaxy_a9),
            PhoneItem(222, " Galaxy A9 Star ", "Samsung", R.drawable.galaxy_a9star),
            PhoneItem(223, " Galaxy Gran Prime Pro", "Samsung", R.drawable.galaxy_granprimeplus),
            PhoneItem(224, " Galaxy J2 Core ", "Samsung", R.drawable.galaxy_j2),
            PhoneItem(225, " Galaxy J2 Pro", "Samsung", R.drawable.galaxy_j2),
            PhoneItem(226, " Galaxy J3 ", "Samsung", R.drawable.galaxy_j3),
            PhoneItem(227, " Galaxy J4 ", "Samsung", R.drawable.galaxy_j4),
            PhoneItem(229, " Galaxy J4+ ", "Samsung", R.drawable.galaxy_j4mais),
            PhoneItem(230, " Galaxy J6 ", "Samsung", R.drawable.galaxy_j6),
            PhoneItem(231, " Galaxy J6+ ", "Samsung", R.drawable.galaxy_j6mais),
            PhoneItem(234, " Galaxy J7 Pro ", "Samsung", R.drawable.galaxy_j7pro),
            PhoneItem(235, " Galaxy J8 ", "Samsung", R.drawable.galaxy_j8),
            PhoneItem(236, " Galaxy Note 9", "Samsung", R.drawable.galaxy_note9),
            PhoneItem(237, " Galaxy Light Luxury", "Samsung", R.drawable.galaxy_lightluxury),
            PhoneItem(238, " Galaxy S9 ", "Samsung", R.drawable.galaxy_s9),
            PhoneItem(239, " Galaxy S9+ ", "Samsung", R.drawable.galaxy_s9mais),
            PhoneItem(240, " Galaxy A01 ", "Samsung", R.drawable.galaxy_a01),
            PhoneItem(241, " Galaxy A10 ", "Samsung", R.drawable.galaxy_a10),
            PhoneItem(242, " Galaxy A10e ", "Samsung", R.drawable.galaxy_a10e),
            PhoneItem(243, " Galaxy A10s ", "Samsung", R.drawable.galaxy_a10s),
            PhoneItem(244, " Galaxy A2 core ", "Samsung", R.drawable.galaxy_a2),
            PhoneItem(245, " Galaxy A20 ", "Samsung", R.drawable.galaxy_a20),
            PhoneItem(246, " Galaxy A20e ", "Samsung", R.drawable.galaxy_a20e),
            PhoneItem(247, " Galaxy A20s ", "Samsung", R.drawable.galaxy_a20s),
            PhoneItem(248, " Galaxy A30 ", "Samsung", R.drawable.galaxy_a30),
            PhoneItem(249, " Galaxy A30s ", "Samsung", R.drawable.galaxy_a30s),
            PhoneItem(250, " Galaxy A40 ", "Samsung", R.drawable.galaxy_a40),
            PhoneItem(251, "  Galaxy A50 ", "Samsung", R.drawable.galaxy_a50),
            PhoneItem(252, " Galaxy A50s ", "Samsung", R.drawable.galaxu_a50s),
            PhoneItem(253, " Galaxy A51", "Samsung", R.drawable.galaxy_a51),
            PhoneItem(254, " Galaxy A60", "Samsung", R.drawable.galaxy_a60),
            PhoneItem(255, " Galaxy A70 ", "Samsung", R.drawable.galaxy_a70),
            PhoneItem(256, " Galaxy A70s ", "Samsung", R.drawable.galaxy_a70s),
            PhoneItem(257, " Galaxy A71 ", "Samsung", R.drawable.galaxy_a71),
            PhoneItem(258, " Galaxy A80 ", "Samsung", R.drawable.galaxy_a80),
            PhoneItem(259, " Galaxy A90 5G  ", "Samsung", R.drawable.galaxy_a90),
            PhoneItem(260, " Galaxy Fold  ", "Samsung", R.drawable.galaxy_fold),
            PhoneItem(261, "  Galaxy Fold 5G  ", "Samsung", R.drawable.galaxy_fold),
            PhoneItem(262, " Galaxy M10  ", "Samsung", R.drawable.galaxy_m10),
            PhoneItem(263, " Galaxy M10s ", "Samsung", R.drawable.galaxy_m10s),
            PhoneItem(249, " Galaxy M20 ", "Samsung", R.drawable.galaxy_m20),
            PhoneItem(250, " Galaxy M30 ", "Samsung", R.drawable.galaxy_m30),
            PhoneItem(251, "  Galaxy M30s ", "Samsung", R.drawable.galaxy_m30s),
            PhoneItem(252, " Galaxy M40 ", "Samsung", R.drawable.moto_e40),
            PhoneItem(253, " Galaxy Note 10", "Samsung", R.drawable.galaxy_note10),
            PhoneItem(255, " Galaxy Note 10+ ", "Samsung", R.drawable.galaxy_note10mais),
            PhoneItem(257, " Galaxy S10 ", "Samsung", R.drawable.galaxy_s10),
            PhoneItem(259, " Galaxy S10+  ", "Samsung", R.drawable.galaxy_s10mais),
            PhoneItem(260, " Galaxy S10e  ", "Samsung", R.drawable.galaxy_s10e),
            PhoneItem(261, "  Galaxy A11  ", "Samsung", R.drawable.galaxy_a11),
            PhoneItem(262, " Galaxy A12  ", "Samsung", R.drawable.galaxy_a12),
            PhoneItem(263, " Galaxy A21 ", "Samsung", R.drawable.galaxy_a21),
            PhoneItem(264, " Galaxy A31s ", "Samsung", R.drawable.galaxy_a31s),
            PhoneItem(265, " Galaxy A41 ", "Samsung", R.drawable.galaxy_a41),
            PhoneItem(266, " Galaxy A42 5G  ", "Samsung", R.drawable.galaxy_a42),
            PhoneItem(267, " Galaxy A51 5G ", "Samsung", R.drawable.galaxy_a51),
            PhoneItem(269, " Galaxy F41  ", "Samsung", R.drawable.galaxy_f41),
            PhoneItem(270, " Galaxy M01 ", "Samsung", R.drawable.galaxy_m01),
            PhoneItem(271, " Galaxy M01s ", "Samsung", R.drawable.galaxy_m01s),
            PhoneItem(272, " Galaxy M11 ", "Samsung", R.drawable.galaxy_m11),
            PhoneItem(273, "  Galaxy M21 ", "Samsung", R.drawable.galaxy_m21),
            PhoneItem(274, " Galaxy M21s ", "Samsung", R.drawable.galaxy_m21s),
            PhoneItem(275, " Galaxy M31", "Samsung", R.drawable.galaxy_m31s),
            PhoneItem(276, " Galaxy M31s", "Samsung", R.drawable.galaxy_m31s),
            PhoneItem(278, " Galaxy M51 ", "Samsung", R.drawable.galaxy_m51),
            PhoneItem(279, " Galaxy Note 10 Lite ", "Samsung", R.drawable.galaxy_note10lite),
            PhoneItem(280, " Galaxy Note 20 ", "Samsung", R.drawable.galaxy_note20),
            PhoneItem(282, " Galaxy Note 20 Ultra ", "Samsung", R.drawable.galaxy_note20ultra),
            PhoneItem(284, "  Galaxy S10 Lite  ", "Samsung", R.drawable.galaxy_s10lite),
            PhoneItem(285, " Galaxy S20 5G  ", "Samsung", R.drawable.galaxy_s20),
            PhoneItem(286, " Galaxy S20 FE ", "Samsung", R.drawable.galaxy_s20fe),
            PhoneItem(288, " Galaxy S20 Ultra 5G  ", "Samsung", R.drawable.galaxy_s20_ultra),
            PhoneItem(289, "  Galaxy S20+ 5G ", "Samsung", R.drawable.galaxy_s20mais),
            PhoneItem(290, " Galaxy Z Flip  ", "Samsung", R.drawable.galaxy_zflip),
            PhoneItem(292, " Galaxy Z Fold2 5g", "Samsung", R.drawable.galaxy_zfold2),
            PhoneItem(302, " Galaxy A52 ", "Samsung", R.drawable.galaxy_a52),
            PhoneItem(304, "  Galaxy A52s 5G ", "Samsung", R.drawable.galaxy_a52s),
            PhoneItem(305, " Galaxy A72  ", "Samsung", R.drawable.galaxy_a72),
            PhoneItem(307, " Galaxy F02s", "Samsung", R.drawable.galaxy_f02s),
            PhoneItem(308, " Galaxy F12 ", "Samsung", R.drawable.galaxy_f12),
            PhoneItem(309, " Galaxy F22 ", "Samsung", R.drawable.galaxy_f22),
            PhoneItem(310, " Galaxy F42 5G ", "Samsung", R.drawable.galaxy_f42),
            PhoneItem(311, " Galaxy F52 5G ", "Samsung", R.drawable.galaxy_f52),
            PhoneItem(312, " Galaxy F62 ", "Samsung", R.drawable.galaxy_f62),
            PhoneItem(313, " Galaxy M02  ", "Samsung", R.drawable.galaxy_m02),
            PhoneItem(314, "  Galaxy MO2s  ", "Samsung", R.drawable.galaxy_m02),
            PhoneItem(315, " Galaxy M12  ", "Samsung", R.drawable.galaxy_m12),
            PhoneItem(317, " Galaxy M22 ", "Samsung", R.drawable.galaxy_m22),
            PhoneItem(318, " Galaxy M32  ", "Samsung", R.drawable.galaxy_m32),
            PhoneItem(320, " Galaxy A42 5G  ", "Samsung", R.drawable.galaxy_a42),
            PhoneItem(321, " Galaxy A52 5G", "Samsung", R.drawable.galaxy_a52),
            PhoneItem(322, " Galaxy M62", "Samsung", R.drawable.galaxy_m62),
            PhoneItem(323, " Galaxy Quantum 2 ", "Samsung", R.drawable.galaxy_quantum2),
            PhoneItem(324, " Galaxy S21 5G ", "Samsung", R.drawable.galaxy_s21),
            PhoneItem(325, " Galaxy S21 Ultra ", "Samsung", R.drawable.galaxy_s21ultra),
            PhoneItem(326, " Galaxy S21+ 5G ", "Samsung", R.drawable.galaxy_s21mais),
            PhoneItem(327, " Galaxy Z Flip3 5G ", "Samsung", R.drawable.galaxy_zflip3),
            PhoneItem(328, " Galaxy Z Fold3 5G  ", "Samsung", R.drawable.galaxy_zfold3),
            PhoneItem(329, "  Galaxy A03  ", "Samsung", R.drawable.galaxy_a03),
            PhoneItem(330, " Galaxy A04  ", "Samsung", R.drawable.galaxy_a04),
            PhoneItem(331, " Galaxy A04e ", "Samsung", R.drawable.galaxy_a04e),
            PhoneItem(332, " Galaxy A04s ", "Samsung", R.drawable.galaxy_a04s),
            PhoneItem(333, " Galaxy A13  ", "Samsung", R.drawable.galaxy_a13),
            PhoneItem(334, "  Galaxy A23 ", "Samsung", R.drawable.galaxy_a23),
            PhoneItem(336, " Galaxy A33 5G", "Samsung", R.drawable.galaxy_a33),
            PhoneItem(337, " Galaxy A53 5G", "Samsung", R.drawable.galaxy_a53),
            PhoneItem(338, " Galaxy A73 5G ", "Samsung", R.drawable.galaxy_a73),
            PhoneItem(339, " Galaxy F13 ", "Samsung", R.drawable.galaxy_f13),
            PhoneItem(340, " Galaxy F23 ", "Samsung", R.drawable.galaxy_f23),
            PhoneItem(341, " Galaxy M04 ", "Samsung", R.drawable.galaxy_m04),
            PhoneItem(342, " Galaxy M13 ", "Samsung", R.drawable.galaxy_m13),
            PhoneItem(343, " Galaxy M23  ", "Samsung", R.drawable.galaxy_m23),
            PhoneItem(344, "  Galaxy M33  ", "Samsung", R.drawable.galaxy_m33),
            PhoneItem(345, " Galaxy A14 ", "Samsung", R.drawable.galaxy_a14),
            PhoneItem(346, " Galaxy S23  ", "Samsung", R.drawable.galaxy_s23),
            PhoneItem(347, "  Galaxy S23 Ultra", "Samsung", R.drawable.galaxy_s23ultra),
            PhoneItem(347, "  Galaxy S23+  ", "Samsung", R.drawable.galaxy_s23mais),


            )

        val adapter = object : ArrayAdapter<PhoneItem>(this, 0, phoneSuggestions) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = convertView ?: LayoutInflater.from(context)
                    .inflate(R.layout.phone_item, parent, false)

                val phoneItem = getItem(position)
                view.findViewById<TextView>(R.id.text_phone).text = phoneItem?.toString()
                view.findViewById<TextView>(R.id.text_brand).text = phoneItem?.getBrand()
                view.findViewById<ImageView>(R.id.image_phone).setImageResource(phoneItem?.getFlagImage() ?: 0)

                view.setOnClickListener {
                    val phoneModel = phoneItem?.toString() ?: ""
                    val intent = Intent(context, PhoneDetailsActivityScreen::class.java)
                    intent.putExtra(getString(R.string.phone_model), phoneModel)
                    context.startActivity(intent)
                }
                return view
            }
        }

        val backButton = findViewById<Button>(R.id.button_back)
        backButton.setOnClickListener {
            finish()
        }

        val btnIplace = findViewById<ImageButton>(R.id.button_iplace)
        btnIplace.setOnClickListener {
            val intent = Intent(this, AppleActivity::class.java)
            startActivity(intent)
        }

        val btnXiaomi = findViewById<ImageButton>(R.id.button_xiaomi)
        btnXiaomi.setOnClickListener {
            val intent = Intent(this, XiaomiActivity::class.java)
            startActivity(intent)
        }

        val btnMotorola = findViewById<ImageButton>(R.id.button_motorola)
        btnMotorola.setOnClickListener {
            val intent = Intent(this, MotorolaActivity::class.java)
            startActivity(intent)
        }

        val btnSamsung = findViewById<ImageButton>(R.id.button_samsung)
        btnSamsung.setOnClickListener {
            val intent = Intent(this, SamsungActivity::class.java)
            startActivity(intent)
        }


        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.button_search_phones)
        autoCompleteTextView.setAdapter(adapter)

        autoCompleteTextView.onItemClickListener = AdapterView.OnItemClickListener { _, _, _, _ ->
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(autoCompleteTextView.windowToken, 0)
        }

        autoCompleteTextView.onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                autoCompleteTextView.hint = null // Oculte o hint
                autoCompleteTextView.setCompoundDrawablesWithIntrinsicBounds(
                    0,
                    0,
                    R.drawable.ic_lupa,
                    0
                ) // Exiba o ícone de digitação
            } else {
                autoCompleteTextView.hint = getString(R.string.encontrar) // Exiba o hint novamente
                autoCompleteTextView.setCompoundDrawablesWithIntrinsicBounds(
                    0,
                    0,
                    0,
                    0
                ) // Oculte o ícone de digitação
            }
        }
    }
}