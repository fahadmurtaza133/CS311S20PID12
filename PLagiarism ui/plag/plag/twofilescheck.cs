using System;
using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace plag
{
    public partial class twofiles : Form
    {
        public twofiles()
        {
            InitializeComponent();
        }

        private void twofiles_Load(object sender, EventArgs e)
        {

        }

        public void button1_Click(object sender, EventArgs e)
        {
            OpenFileDialog dialog = new OpenFileDialog();
            dialog.Filter = "Text files | *.txt"; // file types, that will be allowed to upload
            dialog.Multiselect = false; // allow/deny user to upload more than one file at a time
            if (dialog.ShowDialog() == DialogResult.OK) // if user clicked OK
            {
                String path = dialog.FileName; // get name of file

                {

                    var fileStream = new FileStream(path, FileMode.Open, FileAccess.Read);
                    string readContents;
                    using (StreamReader streamReader = new StreamReader(path, Encoding.UTF8))
                    {
                        readContents = streamReader.ReadToEnd();
                        MessageBox.Show(readContents);
                    }






                }
            }


        }

        private void button2_Click(object sender, EventArgs e)
        {
            OpenFileDialog dialog = new OpenFileDialog();
            dialog.Filter = "Text files | *.txt"; // file types, that will be allowed to upload
            dialog.Multiselect = false; // allow/deny user to upload more than one file at a time
            if (dialog.ShowDialog() == DialogResult.OK) // if user clicked OK
            {
                String path = dialog.FileName; // get name of file

                {

                    var fileStream = new FileStream(path, FileMode.Open, FileAccess.Read);
                    string readContents;
                    using (StreamReader streamReader = new StreamReader(path, Encoding.UTF8))
                    {
                        readContents = streamReader.ReadToEnd();
                        MessageBox.Show(readContents);
                    }
                }
            }
        }
    }
}
    

