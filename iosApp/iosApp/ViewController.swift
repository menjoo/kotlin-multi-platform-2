//
//  ViewController.swift
//  iosApp
//
//  Created by Menno Morsink on 16/08/2018.
//  Copyright © 2018 Menno Morsink. All rights reserved.
//

import UIKit
import Core

class ViewController: UIViewController {

    @IBOutlet weak var label: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = CoreGreeting().greeting()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

