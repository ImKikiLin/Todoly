/// ************************************************************************************************
/// FILE: Home.dart
/// 
/// DESCRIPTION: 
///     Home page display class
/// 
/// ================================================================================================
/// REVISION HISOTRY ABSTRACT
/// 
/// Programmer: Kiki Lin      Home page display implementation      13Jan2022
/// 
/// ************************************************************************************************

// ignore_for_file: prefer_const_constructors, prefer_const_literals_to_create_immutables, file_names

import 'package:flutter/material.dart';
import '/assets/colors.dart' as color;

class Home extends StatefulWidget {
  const Home({ Key? key }) : super(key: key);

  @override
  _HomepageState createState() => _HomepageState();
}

class _HomepageState extends State<Home> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: color.AppColor.brown,
      body: Container(
        padding: const EdgeInsets.only(left: 20, right: 20),
        child: Column(
          children: [
            SizedBox(height: 40,),
            // Title
            Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text('TO-DOLY',
                style: TextStyle(
                  fontSize: 48,
                  color: color.AppColor.gold,
                  fontWeight: FontWeight.w200,
                  fontFamily: 'Manrope',
                  ),
                ),
              ],
            ),
            SizedBox(height: 15,),
            // mint divider
            Container(
              width: MediaQuery.of(context).size.width,
              height: 15,
              decoration: BoxDecoration(
                color: color.AppColor.mint,
                borderRadius: BorderRadius.only(
                  topRight: Radius.circular(10),
                  topLeft: Radius.circular(10),
                  bottomLeft: Radius.circular(10),
                  bottomRight: Radius.circular(10),
                )
              ),
            ),
            SizedBox(height: 20),
            // New Task button
            ElevatedButton(
              style: ElevatedButton.styleFrom(
                primary: color.AppColor.turquiose,
                onPrimary: color.AppColor.black,
                minimumSize: Size(MediaQuery.of(context).size.width, 50),
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15)
                ),
              ),
              onPressed: () {
                print('button pressed');
              },
              child: Text(
                'NEW TASK',
                style: TextStyle(
                  fontFamily: 'Manrope',
                  fontSize: 30,
                  fontWeight: FontWeight.w200,
                  letterSpacing: 10,
                ),
              ),
            ),
            SizedBox(height: 25,),
            // Tasks container with calendar and tasks
            Container(
              width: MediaQuery.of(context).size.width,
              height: 370,
              decoration: BoxDecoration(
                color: color.AppColor.gold,
                borderRadius: BorderRadius.only(
                  topRight: Radius.circular(15),
                  topLeft: Radius.circular(15),
                  bottomLeft: Radius.circular(15),
                  bottomRight: Radius.circular(15),
                ),
              ),
              child: Column(
                children: [
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Text(
                        "TODAY",
                        textAlign: TextAlign.center,
                        style: TextStyle(
                          color: Colors.black,
                          fontFamily: "Manrope",
                          fontSize: 36,
                          fontWeight: FontWeight.w200,
                        ),
                      ),
                      
                      // Calendar
                      IconButton(
                        icon: Icon(Icons.calendar_today),
                        iconSize: 30,
                        onPressed: () {
                          print('calendar pressed');
                        },
                      )
                    ] 
                  ),

                  // Divider
                  Container(
                    width: 340,
                    height: 1,
                    decoration: BoxDecoration(
                      color: color.AppColor.black,
                      borderRadius: BorderRadius.only(
                        topRight: Radius.circular(10),
                        topLeft: Radius.circular(10),
                        bottomLeft: Radius.circular(10),
                        bottomRight: Radius.circular(10),
                      )
                    ),
                  ),

                  // Task items
                  Center( 
                    child: Text(
                      "YOU HAVE NO TASKS",
                      textAlign: TextAlign.center,
                      style: TextStyle(
                        color: Colors.black,
                        fontFamily: "Manrope",
                        fontSize: 18,
                        fontWeight: FontWeight.w300,
                        letterSpacing: 5,
                      ),
                    )
                  ),

                ],
              )
              
              
              


            ) 
          ]
      ),
      )
    );
  }

}