/// ************************************************************************************************
/// FILE: main.dart
/// 
/// DESCRIPTION: 
///     main file that calls on the home page display
/// 
/// ================================================================================================
/// REVISION HISOTRY ABSTRACT
/// 
/// Programmer: Kiki Lin      Home page implementation      13Jan2022
/// 
/// ************************************************************************************************

import 'package:flutter/material.dart';
import '/assets/colors.dart' as color;
import 'assets/displays/Home.dart';

void main() {
  runApp(const todoly());
}

class todoly extends StatelessWidget {
  const todoly({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.purple,
      ),
      home: const Home(),
    );
  }
}

