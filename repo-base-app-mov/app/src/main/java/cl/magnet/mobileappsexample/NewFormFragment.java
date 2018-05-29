package cl.magnet.mobileappsexample;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cl.magnet.mobileappsexample.db.Form;
import cl.magnet.mobileappsexample.db.FormViewModel;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NewFormFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NewFormFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewFormFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FormViewModel mFormViewModel;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public NewFormFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewFormFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewFormFragment newInstance(String param1, String param2) {
        NewFormFragment fragment = new NewFormFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mFormViewModel = ViewModelProviders.of(getActivity()).get(FormViewModel.class);
        return inflater.inflate(R.layout.fragment_new_form, container, false);
    }
}
