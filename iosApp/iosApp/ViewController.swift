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

    lazy var counterRepository: CoreCounterRepository = CoreCounter.counterRepository()
    
    @IBOutlet weak var label: UILabel!
    @IBOutlet weak var counterLabel: UILabel!
    
    @IBAction func tapBtn(_ sender: UIButton) {
        counterRepository.increment()
        showTappedCount()
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = CoreGreeting().greeting()
        showTappedCount()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    private func showTappedCount() {
        counterLabel.text = "You tapped \(counterRepository.getCount()) times!"
    }
}
