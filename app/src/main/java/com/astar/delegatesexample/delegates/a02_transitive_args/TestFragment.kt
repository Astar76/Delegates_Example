package com.astar.delegatesexample.delegates.a02_transitive_args

import androidx.fragment.app.Fragment

class TestFragment : Fragment() {

    private var param1: Int by argument()
    private var param2: String by argument()

    companion object {
        fun newInstance(param1: Int, param2: String): TestFragment {
            return TestFragment().apply {
                this.param1 = param1
                this.param2 = param2
            }
        }
    }
}