package com.example.anoop.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment.*

class Fragment1 : Fragment() {

    companion object {
        fun newInstance(): Fragment1 {
            return Fragment1()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = "Fragment1"
        view.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
    }
}


class Fragment2 : Fragment() {

    companion object {
        fun newInstance(): Fragment2 {
            return Fragment2()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = "Fragment2"
        view.setBackgroundColor(resources.getColor(android.R.color.holo_blue_dark))
    }
}


class Fragment3 : Fragment() {

    companion object {
        fun newInstance(): Fragment3 {
            return Fragment3()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = "Fragment3"
        view.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))

    }
}


class Fragment4 : Fragment() {

    companion object {
        fun newInstance(): Fragment4 {
            return Fragment4()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = "Fragment4"
        view.setBackgroundColor(resources.getColor(android.R.color.holo_orange_dark))

    }
}


class Fragment5 : Fragment() {

    companion object {
        fun newInstance(): Fragment5 {
            return Fragment5()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = "Fragment5"
        view.setBackgroundColor(resources.getColor(android.R.color.darker_gray))

    }
}

class Fragment6 : Fragment() {

    companion object {
        fun newInstance(): Fragment6 {
            return Fragment6()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = "Fragment6"
        textView.setTextColor(resources.getColor(android.R.color.white))
        view.setBackgroundColor(resources.getColor(android.R.color.black))
    }
}

